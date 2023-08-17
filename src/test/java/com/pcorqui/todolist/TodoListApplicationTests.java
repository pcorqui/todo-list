package com.pcorqui.todolist;

import com.pcorqui.todolist.entity.Course;
import com.pcorqui.todolist.persistence.CourseRepository;
import com.pcorqui.todolist.services.MoviesServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TodoListApplicationTests {

	@Autowired
	MoviesServices moviesServices;

	@Test
	void contextLoads() {
	}

	@Test
	void estaMadreFunciona(){
		boolean esverdad = moviesServices.otraPrueba();
		assertTrue(esverdad);
	}

	@Test
	void estaOtraMadreNoFunciona(){
		boolean noEsVerdad = moviesServices.otraPrueba();
		assertTrue(noEsVerdad);
	}

}
