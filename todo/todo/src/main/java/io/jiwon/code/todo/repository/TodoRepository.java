package io.jiwon.code.todo.repository;

import io.jiwon.code.todo.entity.Todo;
import io.jiwon.code.todo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
//Id가 Long이어서 두 번째 인자가 long

}
