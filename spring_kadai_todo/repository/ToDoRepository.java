package com.example.spring_kadai_todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.spring_kadai_todo.entity.ToDo;
public interface ToDoRepository  extends JpaRepository<ToDo,Integer>{

}
