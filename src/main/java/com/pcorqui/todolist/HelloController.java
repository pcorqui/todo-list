package com.pcorqui.todolist;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;

@RestController
@RequestMapping("hola")
public class HelloController {

    @Autowired
    Environment env;

    @GetMapping
    public String Saludas(){

        try{
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
            Date firstDate = sdf.parse("04/22/2020");
            Date secondDate = sdf.parse("04/27/2020");

            System.out.println("tiene que dar 0: "+plazo(firstDate,secondDate));
        }catch(Exception e){
            System.out.println("algo salio mal");
        }
        return "hola perro";
    }

    @PostMapping("csrf")
    public String csrf(){
        return "prueba csrf";
    }

    public static Integer plazo(Date dateNow, Date datePrestamo){
        Long differenceMiliseconds = dateNow.getTime() - datePrestamo.getTime();
        Long differenceTime = TimeUnit.MILLISECONDS.toDays(differenceMiliseconds);
        return differenceTime.intValue();
    }

    @GetMapping("/lamda")
    public void lamda(){

        System.out.println(funcion(x->x+3,5));
    }

    public Integer funcion(Function<Integer,Integer> calcular, int numero){
        return calcular.apply(numero);
    }


}
