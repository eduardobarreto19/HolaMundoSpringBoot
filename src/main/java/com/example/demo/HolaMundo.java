package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //exponer api rest
public class HolaMundo {

    @RequestMapping("/") //Indica que se ejecuta este metodo cuando visitamos la raiz
    public String hola(){
        return "hola mundo ";
    }
}
