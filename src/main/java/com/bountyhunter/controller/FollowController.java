package com.bountyhunter.controller;

import com.bountyhunter.comm.ResponseVo;
import com.bountyhunter.comm.log.Log;
import com.bountyhunter.model.Follow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Li.Z.F on 2018/9/30.
 */
@RestController
@RequestMapping("/follow")
public class FollowController {
    @Autowired
    private ResponseVo responseVo;

    @RequestMapping(value = "addfollow")
    @Log(module = "新增关注人",url = "/follow/addfollow")
    public ResponseVo addFollow(Follow follow,String k){
        return responseVo;
    }

    @RequestMapping(value = "updfollow")
    @Log(module = "删除关注人/新增关注人",url = "/follow/updfollow")
    public ResponseVo updFollow(Follow follow,String k) {
        return responseVo;
    }

    @RequestMapping(value = "getfollows")
    @Log(module = "获取关注人",url = "/follow/getfollow")
    public ResponseVo getFollow(Follow follow,String k){
        return responseVo;
    }
}
