package com.cursosj.springbootweb.app.controllers;

import com.cursosj.springbootweb.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;

@RequestMapping("/app")
@Controller
public class IndexController {
    //RequestMapping se encarga de mapear una ruta URL
    @GetMapping(value = {"/", "/index", ""})
    public String index(Model model) {
        model.addAttribute("titulo", "Hola Spring");
        return "index";
    }

    @GetMapping("/perfil")
    public String perfil(Model model) {
        model.addAttribute("titulo", "Perfil del usuario - Spring");
        model.addAttribute("usuario", new Usuario("Manuel", "Ponton", "manu@gmail.com"));
        return "perfil";
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("titulo", "Lista de usuarios - Spring");
        model.addAttribute("usuarios", Arrays.asList(
                new Usuario("Carlos", "Lopez", ""),
                new Usuario("Jorge", "Castro", "castro@gmail.com")));
        return "listar";
    }
}
