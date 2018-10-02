package com.bountyhunter.controller;

import com.bountyhunter.comm.ResponseVo;
import com.bountyhunter.comm.log.Log;
import com.bountyhunter.model.DemandDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Li.Z.F on 2018/9/30.
 */
@RestController
@RequestMapping("/demanddetail")
public class DemandDetailController {
    @Autowired
    private ResponseVo responseVo;

    @RequestMapping(value = "adddemanddetail")
    @Log(module = "新增需求文章详细",url = "/demanddetail/adddemanddetail")
    public ResponseVo addDemandDetail(DemandDetail demandDetail,String k){
        return responseVo;
    }

    @RequestMapping(value = "deldemanddetail")
    @Log(module = "删除需求文章详细",url = "/demanddetail/deldemanddetail")
    public ResponseVo delDemandDetail(DemandDetail demandDetail,String k){
        return responseVo;
    }

    @RequestMapping(value = "upddemanddetail")
    @Log(module = "修改需求文章详细",url = "/demanddetail/upddemanddetail")
    public ResponseVo updDemandDetail(DemandDetail demandDetail,String k){
        return responseVo;
    }

    @RequestMapping(value = "getdemanddetail")
    @Log(module = "获取需求文章详细",url = "/demanddetail/getdemanddetail")
    public ResponseVo getDemandDetail(DemandDetail demandDetail,String k){
        return responseVo;
    }
}
