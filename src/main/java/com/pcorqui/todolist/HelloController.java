package com.pcorqui.todolist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hola")
public class HelloController {

    @GetMapping
    public String Saludas(){
        return "hola perro";
    }

}
