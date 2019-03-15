package com.gwd.demokwejk.controller;

import com.gwd.demokwejk.data.CategoryRepository;
import com.gwd.demokwejk.data.GifRepository;
import com.gwd.demokwejk.model.Category;
import com.gwd.demokwejk.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GifRepository gifRepository;


    @RequestMapping("/categories")
    public String gitCategories(ModelMap modelMap) {
        List<Category> categories = categoryRepository.getAllCategories();
        modelMap.put("categories", categories);
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String gitCategoriesById(@PathVariable Integer id, ModelMap modelMap) {

        modelMap.put("gifs", gifRepository.getGifsById(id));
        modelMap.put("category", categoryRepository.getById(id));

        return "category";
    }

//    @RequestMapping("/category/{id}")
//    public String gitCategoriesById(@PathVariable Integer id, ModelMap modelMap) {
//
//        modelMap.put("categories", gifRepository.getGifsById(id));
//        System.out.println(id + " " + gifRepository.getGifsById(id).size());
//        return "categories";
//    }

}
