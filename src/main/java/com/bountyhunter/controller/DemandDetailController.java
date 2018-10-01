package com.bountyhunter.controller;

import com.bountyhunter.comm.ResponseVo;
import com.bountyhunter.model.DemandDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Li.Z.F on 2018/9/30.
 */
@RestController
@RequestMapping("/demandDetail")
public class DemandDetailController {
    @Autowired
    private ResponseVo responseVo;

    @RequestMapping(value = "adddemanddetail")
    public ResponseVo addDemandDetail(DemandDetail demandDetail,String k){
        return responseVo;
    }

    @RequestMapping(value = "deldemanddetail")
    public ResponseVo delDemandDetail(DemandDetail demandDetail,String k){
        return responseVo;
    }

    @RequestMapping(value = "upddemanddetail")
    public ResponseVo updDemandDetail(DemandDetail demandDetail,String k){
        return responseVo;
    }

    @RequestMapping(value = "getdemanddetail")
    public ResponseVo getDemandDetail(DemandDetail demandDetail,String k){
        return responseVo;
    }
}
