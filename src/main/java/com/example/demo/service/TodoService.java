package com.example.demo.service;

import com.example.demo.model.Todo;
import com.example.demo.repository.TodoDaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    TodoDaoRepository todoDaoRepository;


    public List<Todo> getALLTodosInMyList()
    {
        return todoDaoRepository.getAllTodos();

    }


    public void saveTodo(Todo requestData) {
        todoDaoRepository.saveTodo(requestData);

    }
}
