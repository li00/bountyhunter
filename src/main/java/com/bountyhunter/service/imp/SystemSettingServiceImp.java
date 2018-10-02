package com.bountyhunter.service.imp;

import com.bountyhunter.dao.SystemSettingDao;
import com.bountyhunter.model.SystemSetting;
import com.bountyhunter.service.ISystemSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Li.Z.F on 2018/10/2.
 */
@Service
public class SystemSettingServiceImp implements ISystemSettingService {

    @Autowired
    private SystemSettingDao systemSettingDao;

    @Override
    public void addSystemSetting(SystemSetting systemSetting) {

    }

    @Override
    public int delSystemSetting(SystemSetting systemSetting) {
        return 0;
    }

    @Override
    public int updSystemSetting(SystemSetting systemSetting) {
        return 0;
    }

    @Override
    public String getSystemSetting(SystemSetting systemSetting) {
        return null;
    }
}
