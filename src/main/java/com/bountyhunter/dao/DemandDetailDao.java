package com.bountyhunter.dao;

import com.bountyhunter.model.DemandDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Li.Z.F on 2018/9/30.
 */
@Component
public class DemandDetailDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void addDemandDetail(DemandDetail demandDetail){

    }

    public void deladdDemandDetail(DemandDetail demandDetail){

    }

    public void updaddDemandDetail(DemandDetail demandDetail){

    }

    public List<DemandDetail> getaddDemandDetail(DemandDetail demandDetail){
        return mongoTemplate.findAll(DemandDetail.class);
    }
}
