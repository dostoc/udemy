package com.spring.udemy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "forward:/app/index"; 

        // forward: (la ruta se mantiene estatica localhos/)
        // paginas de inicio por elenplo paraque quede www.pag.com/
        
        
        // redirect: (la ruta cambia a localhost/app/...)
        // paginas de inicio por elenplo paraque quede www.pag.com/app/... 
        // con estos parametros se reinicia el request (se reinicia la aplicacion)
        // tener en cuenta que esto esta "redirigiendo al metodo".
        // a otro sitio "redirect:https://www.google.com" ejemplo
    }
    
}
