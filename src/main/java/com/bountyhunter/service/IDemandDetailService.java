package com.bountyhunter.service;

import com.bountyhunter.model.DemandDetail;

import java.util.List;

/**
 * Created by Li.Z.F on 2018/9/30.
 */
public interface IDemandDetailService {

    public void addDemandDetail(DemandDetail demandDetail);

    public void delDemandDetail(DemandDetail demandDetail);

    public void updDemandDetail(DemandDetail demandDetail);

    public List<DemandDetail> getDemandDetail(DemandDetail demandDetail);
}
