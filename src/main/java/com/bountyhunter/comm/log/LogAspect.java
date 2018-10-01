package com.bountyhunter.comm.log;

import com.bountyhunter.comm.ResponseVo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * Created by Li.Z.F on 2016/1/23.
 */
@Component
@Aspect
public class LogAspect {

    @Autowired
    private CustomLog customLog;
    @Autowired
    private ResponseVo responseVo;

    /**
     * 前置通知
     * 第1个*：方法返回类型(任意返回类型)
     * 第2个*：包下的所有类
     * 第3个*：类中所有的方法
     * sa*：以sa开头的所有方法
     * ..：方法的任意参数(类型，个数)
     */
    @Before("execution(* com.bountyhunter.controller.*.*(..))")
    public void logBefore(JoinPoint point){
        StringBuilder param = new StringBuilder();
        Object[] paramValue = point.getArgs();
        String[] paramField = ((MethodSignature)point.getSignature()).getParameterNames();
        for(int i=0;i<paramField.length;i++) {
            param.append(paramField[i]+":"+paramValue[i]+"");
        }
        customLog.log((point.getTarget().toString().split("@"))[0],param);
    }

    /**
     * 方法抛出异常时执行
     * @param point
     */
    @AfterThrowing("execution(* com.bountyhunter.controller.*.*(..))")
    public ResponseVo logAfterThrowing(JoinPoint point){
        StringBuilder param = new StringBuilder();
        Object[] paramValue = point.getArgs();
        String[] paramField = ((MethodSignature)point.getSignature()).getParameterNames();
        for(int i=0;i<paramField.length;i++) {
            param.append(paramField[i]+":"+paramValue[i]+"");
        }
        customLog.err("class:"+point.getTarget().toString().split("@")[0]+"||param:"+param);
        return responseVo;
    }
}
