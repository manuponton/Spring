package com.cursosj.springbootweb.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("params")
public class EjemploParamsControllers {
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("titulo", "Enviar parametros");
        return "params/index";
    }
    @GetMapping("string")
    public String param(@RequestParam(name = "texto", required = false, defaultValue = "Algún valor") String textoOtro, Model model){
        model.addAttribute("titulo", "Recibir parametros");
        model.addAttribute("parametro","El texto recibido es: "+textoOtro);
        return "params/ver";
    }
}
