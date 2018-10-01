package com.bountyhunter.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 需求集合
 * Created by Li.Z.F on 2018/9/30.
 */
@Data
@Document(collection = "demand")
public class Demand {
    @Id
    private String id;
    private String title;         //标题
    private String content;       //内容
    private String user;          //发布人
    private String amount;        //悬赏金额
    private Integer status;       //状态
    private String createTime;    //发布时间
    private Integer sort;         //排序
    private String validityTime;  //有效期
    private Integer visitorNumber;//浏览人数
    private Integer credit;       //历史信用度
}
