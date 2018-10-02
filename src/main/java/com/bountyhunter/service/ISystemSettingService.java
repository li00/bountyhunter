package com.bountyhunter.service;

import com.bountyhunter.model.SystemSetting;

/**
 * Created by Li.Z.F on 2018/9/29.
 */
public interface ISystemSettingService {

    public void addSystemSetting(SystemSetting systemSetting);

    public int  delSystemSetting(SystemSetting systemSetting);

    public int  updSystemSetting(SystemSetting systemSetting);

    public String getSystemSetting(SystemSetting systemSetting);
}

