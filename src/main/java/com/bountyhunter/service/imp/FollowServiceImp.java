package com.bountyhunter.service.imp;

import com.bountyhunter.dao.FollowDao;
import com.bountyhunter.model.Follow;
import com.bountyhunter.service.IFollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Li.Z.F on 2018/9/30.
 */
@Service
public class FollowServiceImp implements IFollowService {
    @Autowired
    private FollowDao followDao;

    @Override
    public void addFollow(Follow follow) {

    }

    @Override
    public void delFollow(Follow follow) {

    }

    @Override
    public void updFollow(Follow follow) {

    }

    @Override
    public List<Follow> getFollows(Follow follow) {
        return null;
    }
}
