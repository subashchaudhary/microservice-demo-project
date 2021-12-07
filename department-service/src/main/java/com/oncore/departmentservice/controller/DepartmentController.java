package com.oncore.departmentservice.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oncore.departmentservice.model.Department;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	List<Department> departments = new ArrayList();
	
	@GetMapping("/all-department")
	public List<Department> getDepartment() {
		
		departments = Arrays.asList(new Department(100,"sales"), new Department(101,"production"));
		
		
		return departments;
	}
	
	
	@GetMapping("/dep-info/{id}")
	@ResponseBody
	public Department getDepartment(@PathVariable Integer id) {
		departments = Arrays.asList(new Department(100,"sales"), new Department(101,"production"));
		System.out.println("Inside getDepartment() method");
		
		Department dep = null;
		for(Department department : departments) {
			 
			
			if(department.getDepId() == id) {
				System.out.println("true");
				dep = new Department(department.getDepId(), department.getDepartmentName());
			}
		}
		return dep;
	}
}
