package com.bountyhunter.comm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * 邮件发送
 * Created by Li.Z.F on 2018/10/1.
 */
@Component
public class MailUtil {

    @Value("${spring.mail.username}")
    private String username;

    @Autowired
    private JavaMailSender jms;

    public Integer sendMail(String sendTo,String title,String content){
        //建立邮件消息
        SimpleMailMessage mainMessage = new SimpleMailMessage();
        //发送者
        mainMessage.setFrom(username);
        mainMessage.setTo(sendTo);
        //发送的标题
        mainMessage.setSubject(title);
        //发送的内容
        mainMessage.setText(content);
        jms.send(mainMessage);
        return 1;
    }
}
