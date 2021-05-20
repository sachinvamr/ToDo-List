package demo.todolist.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.todolist.springboot.model.To_Do_List;

@Repository
public interface TodoRepository extends JpaRepository<To_Do_List, Long>{

}
