package com.bountyhunter.controller;

import com.bountyhunter.comm.MailUtil;
import com.bountyhunter.comm.ResponseVo;
import com.bountyhunter.comm.Security;
import com.bountyhunter.comm.log.Log;
import com.bountyhunter.model.User;
import com.bountyhunter.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Created by Li.Z.F on 2018/10/1.
 */
@RestController
@RequestMapping("/manage")
public class ManageController {

    @Autowired
    private ResponseVo responseVo;
    @Autowired
    IUserService userService;
    @Autowired
    private Security security;

    private HttpSession session;

    @Autowired
    private MailUtil mailUtil;

    @RequestMapping(value = "/code")
    @Log(module = "获取验证码",url = "/manage/code")
    public ResponseVo login(String phone,String k){
        if (phone != null && !"".equals(phone.trim())){
            String[] code = security.getCode();
            session.setAttribute(phone,code[0]);
            responseVo.setData(code[1]);
            responseVo.setState(true);
        }
        return responseVo;
    }

    @RequestMapping(value = "/login")
    @Log(module = "用户登录",url = "/manage/login")
    public ResponseVo login(String phone, String password, String code,String k){
        if(code.equals(session.getAttribute(phone))){
            User user = new User();
            responseVo.setData(userService.getUser(user));
            responseVo.setState(true);
        }
        return responseVo;
    }

    @RequestMapping(value = "/register")
    @Log(module = "用户注册",url = "/manage/register")
    public ResponseVo register(@RequestBody User user,String k){
        // 用户组册的时候得初始化关注人（follow）个人偏好（systemSetting）集合表
        return responseVo;
    }

    @RequestMapping(value = "/pwd")
    @Log(module = "用户找回密码",url = "/manage/pwd")
    public ResponseVo findPassword(String email,String k){
        int result = mailUtil.sendMail(email,"赏金猎人密码修改","密码为123456");
        if(result == 1) responseVo.setState(true);
        return responseVo;
    }
}
