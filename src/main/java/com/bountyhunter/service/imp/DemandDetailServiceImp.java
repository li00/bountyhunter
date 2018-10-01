package com.bountyhunter.service.imp;

import com.bountyhunter.dao.DemandDetailDao;
import com.bountyhunter.model.DemandDetail;
import com.bountyhunter.service.IDemandDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Li.Z.F on 2018/9/30.
 */
@Service
public class DemandDetailServiceImp implements IDemandDetailService {
    @Autowired
    private DemandDetailDao demandDetailDao;


    @Override
    public void addDemandDetail(DemandDetail demandDetail) {

    }

    @Override
    public void delDemandDetail(DemandDetail demandDetail) {

    }

    @Override
    public void updDemandDetail(DemandDetail demandDetail) {

    }

    @Override
    public List<DemandDetail> getDemandDetail(DemandDetail demandDetail) {
        return null;
    }
}
