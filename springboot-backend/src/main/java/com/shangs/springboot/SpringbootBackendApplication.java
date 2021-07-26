package com.shangs.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shangs.springboot.model.User;
import com.shangs.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Shang", "Shi", "shangs@mtu.edu"));
		this.userRepository.save(new User("Tom", "Cruise", "Tom@mtu.edu"));
		this.userRepository.save(new User("AL", "Paceno", "Al@mtu.edu"));
		this.userRepository.save(new User("Bob", "Denero", "Bob@mtu.edu"));
	}

}
