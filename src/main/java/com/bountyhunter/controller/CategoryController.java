package com.bountyhunter.controller;

import com.bountyhunter.comm.ResponseVo;
import com.bountyhunter.comm.log.Log;
import com.bountyhunter.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Li.Z.F on 2018/9/30.
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ResponseVo responseVo;

    @RequestMapping(value = "addcategory")
    @Log(module = "新增分类", url = "/category/addcategory")
    public ResponseVo addCategory(Category category,String k){
        return responseVo;
    }

    @RequestMapping(value = "delcategory")
    @Log(module = "删除分类", url = "/category/delcategory")
    public ResponseVo delCategory(Category category,String k){
        return responseVo;
    }

    @RequestMapping(value = "updcategory")
    @Log(module = "修改分类", url = "/category/updcategory")
    public ResponseVo updCategory(Category category,String k){
        return responseVo;
    }

    @RequestMapping(value = "getcategorys")
    @Log(module = "获取首页分类", url = "/category/getcategorys")
    public ResponseVo getCategorys(String k){
        return responseVo;
    }
}
