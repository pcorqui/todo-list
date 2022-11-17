package com.pcorqui.todolist.controller;

import com.pcorqui.todolist.entity.Task;
import com.pcorqui.todolist.persistence.SaldoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tarea")
public class TaskController {

    @Autowired
    SaldoRespository saldoRespository;

    //@GetMapping("/all")
    //public List<Task> getAll(){
      //  return (List<Task>) saldoRespository.findAll();
    //}
}
