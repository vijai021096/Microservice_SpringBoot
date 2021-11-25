package com.vj.userService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vj.userService.controller.utils.ResponseEntity;
import com.vj.userService.entity.Department;
import com.vj.userService.entity.UserEntity;
import com.vj.userService.entity.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public UserEntity save(UserEntity user) {
		
		return userRepository.save(user);
	}

	public ResponseEntity getUserById(Long id) {
		
		ResponseEntity rp = new ResponseEntity();
		
		UserEntity user = userRepository.findByUserId(id);
		Department dep = restTemplate.getForObject("http://localhost:9091/departments/"+user.getDepartmentId(),Department.class);
		
		rp.setUser(user);
		rp.setDepartment(dep);
		
		return rp;
		
	}

}
