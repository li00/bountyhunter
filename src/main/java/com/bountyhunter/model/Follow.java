package com.bountyhunter.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 关注
 * Created by Li.Z.F on 2018/10/1.
 */
@Data
@Document(collection = "follow")
public class Follow {
    @Id
    private String id;
    private String userId;   //所属用户
    private String follow;   //已关注({"nickName":"值","id";"","time":""})
    private String beFollow; //被关注({"nickName":"值","id";"","time":""})
}
