package com.bountyhunter.dao;

import com.bountyhunter.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Li.Z.F on 2018/10/1.
 */
@Component
public class MessageDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void addMessage(Message message){

    }

    public void delMessage(Message message){

    }

    public void updMessage(Message message){

    }

    public Message getMessage(Message message){
        Query query = new Query(Criteria.where("").gt(""));
        return mongoTemplate.findOne(query,Message.class);
    }

    public List<Message> getMessages(Message message){
        return mongoTemplate.findAll(Message.class);
    }
}
