package pl.myfirstproject.todo.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.myfirstproject.todo.todoapp.model.Todo;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long > {
    List< Todo > findByUserName(String user);
}