package com.bountyhunter.dao;

import com.bountyhunter.model.Demand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Li.Z.F on 2018/9/30.
 */
@Component
public class DemandDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void addDemand(Demand demand){

    }

    public void delDemand(Demand demand){

    }

    public void updDemand(Demand demand){

    }

    public List<Demand> getDemands(Demand demand){
        return mongoTemplate.findAll(Demand.class);
    }
}
