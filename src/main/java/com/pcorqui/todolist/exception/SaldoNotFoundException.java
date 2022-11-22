package com.pcorqui.todolist.exception;

public class SaldoNotFoundException extends RuntimeException{

    public SaldoNotFoundException(String messagge){
        super(messagge);
    }
}
