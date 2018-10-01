package com.bountyhunter.service;

import com.bountyhunter.model.User;

/**
 * Created by Li.Z.F on 2018/9/29.
 */
public interface IUserService {

    public void addUser(User user);

    public int  delUser(User user);

    public int  updUser(User user);

    public String getUser(User user);
}

