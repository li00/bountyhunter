package com.bountyhunter.dao;

import com.bountyhunter.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

/**
 * Created by Li.Z.F on 2018/9/29.
 */
@Component
public class UserDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void addUser(User user){
        mongoTemplate.insert(user);
    }

    public User getUser(User user){
        Query query=new Query(Criteria.where("id").is("5bafa18eaa95b83d9bbbe067"));
        return mongoTemplate.findOne(query,User.class);
    }

    public void delUser(User user){
        Query query= new Query(Criteria.where("id").is("5bafa18eaa95b83d9bbbe067"));
        mongoTemplate.remove(query,User.class);
    }
    public void updUser(User user){
        Query query = new Query(Criteria.where("id").is(user.getId()));
        Update update = new Update().set("userName","");
        mongoTemplate.updateFirst(query,update,User.class);
    }
}
