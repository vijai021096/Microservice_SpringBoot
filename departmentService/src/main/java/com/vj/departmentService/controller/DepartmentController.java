package com.vj.departmentService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vj.departmentService.Service.DepartmentService;
import com.vj.departmentService.entity.DepartmentEntity;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public DepartmentEntity saveDepartment(@RequestBody DepartmentEntity department) {
		
		return departmentService.save(department);
	}
	
	@GetMapping("/{id}")
	public DepartmentEntity getDepartmentById(@PathVariable Long id) {
		return departmentService.getDepartmentById(id);
	}
	
}
