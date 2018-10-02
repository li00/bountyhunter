package com.bountyhunter.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 分类集合
 * Created by Li.Z.F on 2018/9/30.
 */
@Data
@Document(collection = "category")
public class Category {
    @Id
    private String id;
    private String name;      //分类名称
    private String previous;  //上级分类ID
    private Integer layer;    //所在层数
    private String createUser;//创建人
    private String createTime;//创建时间
}
