package com.gwd.demokwejk.controller;

import com.gwd.demokwejk.data.GifRepository;
import com.gwd.demokwejk.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;

   // @ResponseBody // wtedy aby zwracał nam w html to co chcemy widziaeć, ważne do testwo
@RequestMapping("/")
public String listGifs(ModelMap modelMap) {

        List<Gif> gifs = gifRepository.getAllGifs();
        modelMap.put("gifs", gifs);

    return "home";
}


}
