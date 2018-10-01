package com.bountyhunter.comm.log;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 使用注解动作
 * Created by Li.Z.F on 2018/10/1.
 */
@Component
@EnableScheduling
public class CustomLog {

    @Value("${logfile.log}")
    private String logFile;

    private final  Logger LOGGER = LoggerFactory.getLogger(CustomLog.class);
    private final  SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm S");
    private final  SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");

    static ThreadLocal<File> log = new ThreadLocal<>();
    static ThreadLocal<File> err = new ThreadLocal<>();


    //获取日志文件
    private  File getLogFile(){
        if (log.get() == null){
            File f = new File(logFile);
            f.mkdirs();
            File file = new File(logFile+"log-"+format2.format(new Date())+".csv");
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            log.set(file);
            return log.get();
        }else {
            return log.get();
        }
    }

    //获取异常文件
    private File getErrFile(){
        if (err.get() == null){
            File f = new File(logFile);
            f.mkdirs();
            File file = new File(logFile+"err-"+format2.format(new Date())+".txt");
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            err.set(file);
            return err.get();
        }else {
            return err.get();
        }
    }

    @Scheduled(cron = "0 0 0 * * ?")
    private void release(){
        if (log.get() != null ){
            log.remove();
        }
        if(err.get() != null ){
            err.remove();
        }
        System.out.println("新生成文件");
    }

    //写错误日志
    public void err(String content) {
        try {
            Writer out = new FileWriter(getErrFile());
            String data = "time:"+format1.format(new Date())+"||"+content+"\n";
            out.write(data);
            out.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    //写访问日志
    public  void log(String className,Object args) {
        //利用反射获取方法上的注解值
        try {
            Class<?> entity = Class.forName(className.trim());
            if( entity != null && !"".equals(entity)) {
                Method[] methods = entity.getMethods();
                for (Method method : methods) {
                    //获取使用@Log注解的字段
                    Log log = method.getAnnotation(Log.class);
                    if(log != null && !"".equals(log)) {
                        Writer out = new FileWriter(getLogFile());
                        String data= "time:"+format1.format(new Date())+"||module:"+log.module()+"||url:"+log.url()+"||param:"+args+"\n";
                        out.write(data);
                        out.flush();
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
