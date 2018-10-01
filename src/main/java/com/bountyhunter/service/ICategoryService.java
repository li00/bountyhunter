package com.bountyhunter.service;

import com.bountyhunter.model.Category;

import java.util.List;

/**
 * Created by Li.Z.F on 2018/9/30.
 */
public interface ICategoryService {

    public void addCategory(Category category);

    public void delCategory(Category category);

    public void updCategory(Category category);

    public List<Category> getCategory();
}
