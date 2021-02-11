package com.cursosj.springbootweb.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
    //RequestMapping se encarga de mapear una ruta URL
    @GetMapping(value={"/","/index",""})
    public String index(Model model) {
        model.addAttribute("titulo","Hola Spring");
        return "index";
    }
}
