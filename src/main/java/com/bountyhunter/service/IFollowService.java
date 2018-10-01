package com.bountyhunter.service;

import com.bountyhunter.model.Follow;

import java.util.List;

/**
 * Created by Li.Z.F on 2018/9/30.
 */
public interface IFollowService {

    public void addFollow(Follow follow);

    public void delFollow(Follow follow);

    public void updFollow(Follow follow);

    public List<Follow> getFollows(Follow follow);
}
