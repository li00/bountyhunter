package com.bountyhunter.controller;

import com.bountyhunter.comm.ResponseVo;
import com.bountyhunter.comm.log.Log;
import com.bountyhunter.model.User;
import com.bountyhunter.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Li.Z.F on 2018/9/29.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @Autowired
    private ResponseVo responseVo;

    @RequestMapping(value = "/adduser")
    @Log(module = "新增用户数据",url = "/user/adduser")
    public ResponseVo addUser(User user, String k){
        return responseVo;
    }

    @RequestMapping(value = "/upduser")
    @Log(module = "修改用户数据",url = "/user/updtuser")
    public ResponseVo updUser(User user,String k){
        return responseVo;
    }

    @RequestMapping(value = "/getuser")
    @Log(module = "获取用户数据",url = "/user/getuser")
    public ResponseVo getUser(String id,String k){
        try {
            User user = new User();
            user.setId(id);
            responseVo.setState(true);
            responseVo.setData(userService.getUser(user));
        }catch (Exception e){e.printStackTrace();}
        return responseVo;
    }
}
