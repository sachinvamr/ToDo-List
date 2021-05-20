package demo.todolist.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import demo.todolist.springboot.model.To_Do_List;
import demo.todolist.springboot.service.TodoService;

@Controller
public class TodoController {

	@Autowired
	private TodoService todoService;

	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listTasks", todoService.getAllTasks());
		return "index";
	}

	@GetMapping("/showNewtodoForm")
	public String addNewTask(Model model) {
		To_Do_List t = new To_Do_List();
		model.addAttribute("new_task", t);
		return "new_task";
	}

	@PostMapping("/saveTask")
	public String saveTask(@ModelAttribute("new_task") To_Do_List t) {
		todoService.addTask(t);
		return "redirect:/";
	}

	@GetMapping("/deleteTask/{id}")
	public String deleteTask(@PathVariable (value="id")long id) {
		this.todoService.deleteTaskById(id);
		return "redirect:/";
	}

}
