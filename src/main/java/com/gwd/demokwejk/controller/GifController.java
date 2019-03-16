package com.gwd.demokwejk.controller;

import com.gwd.demokwejk.data.GifRepository;
import com.gwd.demokwejk.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;


    // @ResponseBody // wtedy aby zwracał nam w html to co chcemy widziaeć, ważne do testwo
    @RequestMapping("/")
    public String listGifs(@RequestParam(required = false) String q, ModelMap modelMap) {


        if (q == null) {
            List<Gif> gifs = gifRepository.getAllGifs();
            modelMap.put("gifs", gifs);
        } else {
            modelMap.put("gifs", gifRepository.getGifsByName(q));
        }


        return "home";
    }

    @RequestMapping("/favorites")
    public String gifFavorites(ModelMap modelMap) {

        modelMap.put("gifs", gifRepository.getFavoritesGifs());

        return "favorites";
    }

    @RequestMapping("/gif/{name}")
    public String gitGifWithName(@PathVariable String name, ModelMap modelMap) {

        modelMap.put("category", gifRepository.getGifWithName(name));

        return "category";
    }


}
