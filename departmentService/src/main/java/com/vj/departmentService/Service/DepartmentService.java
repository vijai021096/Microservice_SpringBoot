package com.vj.departmentService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vj.departmentService.Repository.DepartmentRepository;
import com.vj.departmentService.entity.DepartmentEntity;

@Service

public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public DepartmentEntity save(DepartmentEntity department) {

		return departmentRepository.save(department);
	}

	public DepartmentEntity getDepartmentById(Long id) {
		
		return departmentRepository.findByDepartmentId(id);
	}

}
