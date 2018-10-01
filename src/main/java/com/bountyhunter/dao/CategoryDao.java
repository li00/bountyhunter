package com.bountyhunter.dao;

import com.bountyhunter.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Li.Z.F on 2018/9/30.
 */
@Component
public class CategoryDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void addCategory(Category category){

    }

    public void delCategory(Category category){

    }

    public void updCategory(Category category){

    }

    public List<Category> getCategory(){
        return mongoTemplate.findAll(Category.class);
    }
}
