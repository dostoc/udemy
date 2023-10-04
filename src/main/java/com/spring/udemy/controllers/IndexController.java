package com.spring.udemy.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.udemy.models.Usuario;


@Controller
@RequestMapping ("/app")
public class IndexController {

    @Value("${texto.indexcontroller.index.titulo}")
    private String textoIndex;
    @Value("${texto.indexcontroller.index.titulosub}")
    private String textoIndexSub;

    
    @Value("${texto.indexcontroller.perfil.titulo}")
    private String textoPerfil;

    @Value("${texto.indexcontroller.listar.titulo}")
    private String textoListar;
    

    

    @GetMapping({"/","","/index","/home"})
    public String index(Model model){
        model.addAttribute("titulo", textoIndex);
        model.addAttribute("subtitulo", textoIndexSub);
        return "index";
    }


    @GetMapping("/perfil")
    public String perfil(Model model){
        Usuario usuario = new Usuario();
        usuario.setNombre("Juan");
        usuario.setApellido("Palotes");
        usuario.setEmail("juan@palotes.com");
        model.addAttribute("titulo", textoPerfil);
        model.addAttribute("usuario", usuario);
        return "perfil";
    }


   
    @GetMapping("/listar")
    public String listar(Model model){
        List<Usuario>usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Juan", "Paco", "juan@gmail.com"));
        usuarios.add(new Usuario("Lolo", "Laslo", "laslo@gmail.com"));
        usuarios.add(new Usuario("Tero", "Dactilo", "dactilo@gmail"));
        model.addAttribute("titulo", textoListar);
        model.addAttribute("usuarios", usuarios);
        return "listar";
    }
    
}
