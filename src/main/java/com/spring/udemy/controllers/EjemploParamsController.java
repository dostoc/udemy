package com.spring.udemy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")  
public class EjemploParamsController {
    

    @GetMapping("/")
    public String index() {
        return "params/index";
    }

    @GetMapping("/string")
    public String param(@RequestParam(name = "texto", defaultValue = "No se enviaron valores", required = false) String texto, Model model) {
        model.addAttribute("resultado", "El parametro enviado es : "+texto );
        return "params/ver";
    }
    

    @GetMapping("/mix-params")
    public String param(@RequestParam String texto, @RequestParam Integer numero, Model model){
        model.addAttribute("resultado", "El texto enviado es '" + texto + "'' y el numero es '" + numero + "'");
        return "params/ver";
    }
    


}
