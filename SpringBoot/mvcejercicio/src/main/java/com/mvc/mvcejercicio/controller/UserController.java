package com.mvc.mvcejercicio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class UserController {
    @GetMapping("/usuario")
    public String usuario (@RequestParam (name = "nombre",required = false, defaultValue = "usuario")
    String name, Model model){
        model.addAttribute("nombre", name);
        return "usuario";
    }
    
}
