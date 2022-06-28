package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class Taskk1Application {

	public static void main(String[] args) {
		
		
		ApplicationContext context=SpringApplication.run(Taskk1Application.class, args);
		UserRepository userRepository=context.getBean(UserRepository.class);
		
		
	
		User user1 = new User();
		user1.setName("ramu");
		user1.setCity("bangalore");
		user1.setAbout("programmer");

		User user2 = new User();
		user2.setName("shivu");
		user2.setCity("mysore");
		user2.setAbout("racer");
		

		User user3 = new User();
		user3.setName("ajit");
		user3.setCity("mangalore");
		user3.setAbout("sportdperson");
		

		User user4 = new User();
		user4.setName("chetan");
		user4.setCity("hassan");
		user4.setAbout("businessman");
		
		//User resultUser = userRepository.save(user2);
		List<User> users = List.of(user1,user2,user3,user4);
		Iterable<User> result = userRepository.saveAll(users);
		
		result.forEach(user-> {
			System.out.println(user);
			});
		
		
		Optional<User> optional = userRepository.findById(2);
		User user = optional.get();
		System.out.println(user);
		
		user.setName("shiva reddy");
		User results = userRepository.save(user);
		
		//System.out.println("saved user"+resultUser);
		System.out.println(results);
		
}
}