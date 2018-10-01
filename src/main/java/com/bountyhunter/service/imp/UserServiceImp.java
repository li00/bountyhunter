package com.bountyhunter.service.imp;

import com.bountyhunter.comm.Security;
import com.bountyhunter.dao.UserDao;
import com.bountyhunter.model.User;
import com.bountyhunter.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Li.Z.F on 2018/9/29.
 */
@Service
public class UserServiceImp implements IUserService{

    @Value("${security.validity}")
    private long validity;

    @Autowired
    private UserDao userDao;
    @Autowired
    private Security security;

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public int delUser(User user) {
        userDao.delUser(user);
        return 0;
    }

    @Override
    public int updUser(User user) {
        userDao.updUser(user);
        return 0;
    }

    @Override
    public String getUser(User user){
        User u = userDao.getUser(user);
        if (user.getPassword().equals(u.getPassword())){
            long current = System.currentTimeMillis();
            String key = ((current+validity)+u.getPhone());
            return security.createCertificate(key);
        }else {
            return null;
        }
    }

}
