package com.bountyhunter.service.imp;

import com.bountyhunter.model.Demand;
import com.bountyhunter.service.IDemandService;
import com.bountyhunter.dao.DemandDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Li.Z.F on 2018/9/30.
 */
@Service
public class DemandServiceImp implements IDemandService {
    @Autowired
    private DemandDao demandDao;

    @Override
    public void addDemand(Demand demand) {
        demandDao.addDemand(demand);

    }

    @Override
    public void delDemand(Demand demand) {
        demandDao.delDemand(demand);
    }

    @Override
    public void updDemand(Demand demand) {
        demandDao.updDemand(demand);
    }

    @Override
    public List<Demand> getDemands(Demand demand) {
        return demandDao.getDemands(demand);
    }
}
