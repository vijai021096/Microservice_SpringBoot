package com.vj.userService.controller.utils;

import com.vj.userService.entity.Department;
import com.vj.userService.entity.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseEntity {
	
	private UserEntity user;
	
	private Department department;

}
