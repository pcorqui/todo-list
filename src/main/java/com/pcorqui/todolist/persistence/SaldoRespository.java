package com.pcorqui.todolist.persistence;

import com.pcorqui.todolist.entity.Task;
import org.springframework.data.repository.CrudRepository;

public interface SaldoRespository extends CrudRepository<Task, Integer> {
}
