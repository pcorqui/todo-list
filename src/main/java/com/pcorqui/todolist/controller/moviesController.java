package com.pcorqui.todolist.controller;

import com.pcorqui.todolist.services.MoviesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movies")
public class moviesController {

    @Autowired
    MoviesServices moviesServices;

    @GetMapping("movies")
    public String movies(){
        return moviesServices.moviesCategories();
    }
}
