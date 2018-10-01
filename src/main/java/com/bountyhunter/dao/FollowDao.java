package com.bountyhunter.dao;

import com.bountyhunter.model.Follow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Li.Z.F on 2018/10/1.
 */
@Component
public class FollowDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void addFollow(Follow follow){

    }

    public void delFollow(Follow follow){

    }

    public void updFollow(Follow follow) {

    }

    public List<Follow> getFollow(Follow follow){
        return mongoTemplate.findAll(Follow.class);
    }
}
