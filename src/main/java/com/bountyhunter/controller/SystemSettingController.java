package com.bountyhunter.controller;

import com.bountyhunter.comm.ResponseVo;
import com.bountyhunter.comm.log.Log;
import com.bountyhunter.model.SystemSetting;
import com.bountyhunter.service.ISystemSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Li.Z.F on 2018/9/29.
 */
@RestController
@RequestMapping("/setting")
public class SystemSettingController {
    @Autowired
    private ISystemSettingService systemSettingService;

    @Autowired
    private ResponseVo responseVo;

    @RequestMapping(value = "/addsystemsetting")
    @Log(module = "新增用户设置",url = "/setting/addsystemsetting")
    public ResponseVo addSystemSetting(SystemSetting systemSetting, String k){
        try {
            systemSettingService.addSystemSetting(systemSetting);
        } catch (Exception e){e.printStackTrace();}
        return responseVo;
    }

    @RequestMapping(value = "/addsystemsetting")
    @Log(module = "还原用户设置",url = "/setting/addsystemsetting")
    public ResponseVo delSystemSetting(SystemSetting systemSetting, String k){
        try {
            systemSettingService.addSystemSetting(systemSetting);
        } catch (Exception e){e.printStackTrace();}
        return responseVo;
    }

    @RequestMapping(value = "/updsystemsetting")
    @Log(module = "修改用户设置",url = "/setting/updsystemsetting")
    public ResponseVo updSystemSetting(SystemSetting systemSetting,String k){
        try {
            systemSettingService.updSystemSetting(systemSetting);
        } catch (Exception e){e.printStackTrace();}
        return responseVo;
    }

    @RequestMapping(value = "/getsystemsetting")
    @Log(module = "获取用户设置",url = "/setting/getsystemsetting")
    public ResponseVo getSystemSetting(String id,String k){
        responseVo.setState(true);
        responseVo.setData(null);
        return responseVo;
    }
}
