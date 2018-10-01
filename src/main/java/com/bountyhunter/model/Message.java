package com.bountyhunter.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 消息通知
 * Created by Li.Z.F on 2018/10/1.
 */
@Data
@Document(collection = "message")
public class Message {
    @Id
    private String id;
    private String content;    //消息内容
    private String messagePubUser;//消息发布人
    private String messageRecUser;//消息接收人
    private String communication; //沟通(数组格式{"nickName":"值"."time":"","id";""，"content":"值","reply":"值","replyTime":""})
}
