package com.pcorqui.todolist.controller;

import com.pcorqui.todolist.entity.Saldo;
import com.pcorqui.todolist.services.SaldoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/saldo")
public class saldoController {

    @Autowired
    SaldoService saldoService;

    @PostMapping("/addSaldo")
    public Saldo addSaldo(@RequestBody Saldo saldo){
        return saldoService.addSaldo(saldo);
    }

    @PutMapping("/add")
    public Saldo add(@RequestBody Saldo saldo){
        return saldoService.add(saldo);
    }
}
