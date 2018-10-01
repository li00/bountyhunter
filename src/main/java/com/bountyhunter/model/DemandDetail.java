package com.bountyhunter.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 需求详细集合
 * Created by Li.Z.F on 2018/9/30.
 */
@Data
@Document(collection = "demandDetail")
public class DemandDetail {
    @Id
    private String id;
    private String did;          //需求id
    private String communication;//沟通(数组格式[{"nickName":"值"."time":"","id";""，"content":"值","reply":"值","replyTime":""}])
    private String solvePerson;  //解决人{"photo":"","nickName":""}
    private String solveTime;    //解日期
    private String payAmount;    //实付金额
    private Integer satisfaction;//服务满意度
    private String userOpinion;  //发布人意见([意见]数组格式)
    private String solvePersonOption;//解决人意见([意见]数组格式)
}
