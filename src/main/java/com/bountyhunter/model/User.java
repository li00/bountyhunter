package com.bountyhunter.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 用户集合
 * Created by Li.Z.F on 2018/9/28.
 */
@Data
@Document(collection = "user")
public class User {
    @Id
    private String id;
    private String password;   //密码
    private String email;      //邮箱
    private String birthday;   //生日
    private String nickName;   //昵称
    private String sex;        //性别
    private String phone;      //手机号
    private String photo;      //头像
    private String occupation; //职业
    private String createTime; //创建时间
    private Integer level;     //等级
    private String role;       //角色
    private String credit;     //信用度
    private String notice;     //消息通知[{'message:'','demand':''}]
}
