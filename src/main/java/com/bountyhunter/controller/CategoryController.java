package com.bountyhunter.controller;

import com.bountyhunter.comm.ResponseVo;
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
    public ResponseVo addCategory(Category category,String k){
        return responseVo;
    }

    @RequestMapping(value = "delcategory")
    public ResponseVo delCategory(Category category,String k){
        return responseVo;
    }

    @RequestMapping(value = "updcategory")
    public ResponseVo updCategory(Category category,String k){
        return responseVo;
    }

    @RequestMapping(value = "getcategory")
    public ResponseVo getCategory(String k){
        return responseVo;
    }
}
