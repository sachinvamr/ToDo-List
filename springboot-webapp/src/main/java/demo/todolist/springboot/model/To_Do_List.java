package demo.todolist.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "todo")
public class To_Do_List {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	long id;
	
	
	String task;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTask() {
		return task;
	}


	public void setTask(String task) {
		this.task = task;
	}
	
	
	
	
}
