package io.jiwon.code.todo;

import io.jiwon.code.todo.entity.Todo;
import io.jiwon.code.todo.entity.User;
import io.jiwon.code.todo.repository.TodoRepository;
import io.jiwon.code.todo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner { // 스프링 구동 시점에 특정 코드 구동 시키기

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User(); //
		user.setId(1L);
		user.setPassword("should be hashed");
		user.setUsername("Jiwon");

		Todo todo = new Todo();
		todo.setId(1L);
		todo.setContent("show to do list at 8PM");

		user.getTodoList().add(todo); //User 클래스의 private List<Todo> todoList;과 관련
		// 내가 생각 We'll add a getTodoList method that will return the todoList array.


		todoRepository.save(todo);
		userRepository.save(user);
	}
}
