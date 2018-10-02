package com.bountyhunter.dao;

import com.bountyhunter.model.Demand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
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
        final Pageable pageableRequest = new PageRequest(0,10);
        Query query = new Query();
        query.with(new Sort(new Sort.Order(Sort.Direction.DESC,"createTime")));
        query.with(pageableRequest);
        return mongoTemplate.findAll(Demand.class);
    }
}
