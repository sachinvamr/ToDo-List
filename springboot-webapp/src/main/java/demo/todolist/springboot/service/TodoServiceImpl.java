package demo.todolist.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import demo.todolist.springboot.model.To_Do_List;
import demo.todolist.springboot.repository.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoRepository todoRepository;

	@Override
	public List<To_Do_List> getAllTasks() {
		return todoRepository.findAll();
	}	
	
	@Override
	public void addTask(To_Do_List td) {
		this.todoRepository.save(td);
	}

	@Override
	public void deleteTaskById(long id) {
		this.todoRepository.deleteById(id);	
		
	}
	
	
	
}
