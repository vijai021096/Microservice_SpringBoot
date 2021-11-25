package com.vj.userService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vj.userService.controller.utils.ResponseEntity;
import com.vj.userService.entity.UserEntity;
import com.vj.userService.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public UserEntity saveUser(@RequestBody UserEntity user) {
		return userService.save(user);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity getUsersById(@PathVariable Long id) {
		return userService.getUserById(id);
	}
}
