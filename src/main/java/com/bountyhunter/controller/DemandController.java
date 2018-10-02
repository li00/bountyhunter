package com.bountyhunter.controller;

import com.bountyhunter.comm.ResponseVo;
import com.bountyhunter.comm.log.Log;
import com.bountyhunter.model.Demand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Li.Z.F on 2018/9/30.
 */
@RestController
@RequestMapping("/demand")
public class DemandController {
    @Autowired
    private ResponseVo responseVo;

    @RequestMapping(value = "adddemand")
    @Log(module = "新增需求文章",url = "/demand/adddemand")
    public ResponseVo addDemand(Demand demand,String k){
        return responseVo;
    }

    @RequestMapping(value = "deldemand")
    @Log(module = "删除需求文章",url = "/demand/deldemand")
    public ResponseVo delDemand(Demand demand,String k){
        return responseVo;
    }

    @RequestMapping(value = "upddemand")
    @Log(module = "修改需求文章",url = "/demand/upddemand")
    public ResponseVo updDemand(Demand demand,String k){
        return responseVo;
    }

    @RequestMapping(value = "getdemands")
    @Log(module = "获取首页需求数据",url = "/demand/getdemands")
    public ResponseVo getDemands(String k){
        return responseVo;
    }
}
