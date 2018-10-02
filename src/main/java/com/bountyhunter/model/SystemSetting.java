package com.bountyhunter.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Li.Z.F on 2018/10/2.
 */
@Data
@Document(collection = "systemSetting")
public class SystemSetting {
    private String id;
    private String uid;        //所属用户
    private String categoryId; //每次默认打开的分类
    private String background; //个人背景设置
    private String fontStyle;  //字体设置
    private String headerColor;//头部颜色
}
