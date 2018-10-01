package com.bountyhunter.service;

import com.bountyhunter.model.Demand;

import java.util.List;

/**
 * Created by Li.Z.F on 2018/9/30.
 */
public interface IDemandService {

    public void addDemand(Demand demand);

    public void delDemand(Demand demand);

    public void updDemand(Demand demand);

    public List<Demand> getDemands(Demand demand);
}
