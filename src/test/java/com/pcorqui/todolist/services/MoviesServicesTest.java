package com.pcorqui.todolist.services;

import com.pcorqui.todolist.services.MoviesServices;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertThat;

@SpringBootTest
public class MoviesServicesTest {

    @Autowired
    MoviesServices moviesServices;

    @Test
    public void testForTest() {
        assertTrue(moviesServices.otraPrueba());
    }

    //@Test
    //public void conUnObjeto(){
      //  assertThat("varias pelis", CoreMatchers.is(moviesServices.moviesCategories()));
   // }
}