package com.pcorqui.todolist.services;

import com.pcorqui.todolist.entity.Saldo;
import com.pcorqui.todolist.exception.SaldoNotFoundException;
import com.pcorqui.todolist.persistence.SaldoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaldoService {

    @Autowired
    SaldoRespository saldoRespository;

    public Saldo addSaldo(Saldo saldo){

        return saldoRespository.save(saldo);
    }

    public Saldo add(Saldo saldo){

        Saldo saldoActual = saldoRespository.findById(saldo.getId())
                .orElseThrow(()->new SaldoNotFoundException(String.format("the id %s saldo is not available",saldo.getId())));
        double total = saldoActual.getAmount() + saldo.getAmount();
        saldo.setAmount(total);
        saldoRespository.save(saldo);
        return saldo;
    }
}
