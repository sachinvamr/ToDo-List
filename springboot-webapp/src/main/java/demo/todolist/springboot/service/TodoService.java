package demo.todolist.springboot.service;

import java.util.List;

import demo.todolist.springboot.model.To_Do_List;

public interface TodoService {
	List<To_Do_List> getAllTasks();
	void addTask(To_Do_List td);
	void deleteTaskById(long id);
}
