package com.bountyhunter.service.imp;

import com.bountyhunter.dao.CategoryDao;
import com.bountyhunter.model.Category;
import com.bountyhunter.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Li.Z.F on 2018/9/30.
 */
@Service
public class CategoryServiceImp implements ICategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public void addCategory(Category category) {
        categoryDao.addCategory(category);
    }

    @Override
    public void delCategory(Category category) {
        categoryDao.delCategory(category);
    }

    @Override
    public void updCategory(Category category) {
         categoryDao.updCategory(category);
    }

    @Override
    public List<Category> getCategory() {
        return categoryDao.getCategory();
    }
}
