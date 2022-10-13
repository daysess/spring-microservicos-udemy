package com.daysesoares.hruser.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.daysesoares.hruser.entites.User;
import com.daysesoares.hruser.repositories.UserRepository;

@RestController
@RequestMapping(value = "users")
public class UserResource {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable long id){
		Optional<User> user = userRepository.findById(id);
		return ResponseEntity.ok(user.get());
	}
	
	@GetMapping(value = "/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email){
		User user = userRepository.findByEmail(email);
		return ResponseEntity.ok(user);
	}
	
}
