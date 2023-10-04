package com.spring.udemy.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {

    @Value("${texto.ejemplovariablesrutacontroller.index.titulo}")
    private String indexTitulo;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("titulo", indexTitulo);
        return "variables/index";
    }


    @GetMapping("/string/{texto}")
    public String variables(@PathVariable (name="texto") String textoOtro, Model model){ // tiene que ser igual al texto de la linea 12. En caso que no debe usarse NAME
        model.addAttribute("titulo", indexTitulo);
        model.addAttribute("resultado", "El texto enviado en la ruta es : " + textoOtro);
        return "variables/ver";
    }




    @GetMapping("/string/{texto}/{numero}")
    public String variables(@PathVariable String texto, @PathVariable Integer numero, Model model) {
        model.addAttribute("titulo", "Recibir paramentros de la ruta (@PathVariable))");
        model.addAttribute("resultado", "El texto enviado es '" + texto + "'' y el numero es '" + numero + "'");
        return "variables/ver";
    }


    
    

   
}
