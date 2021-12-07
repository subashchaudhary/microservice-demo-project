package com.oncore.userservice.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.oncore.userservice.model.Department;
import com.oncore.userservice.model.User;
import com.oncore.userservice.model.UserAndDepartment;

@RestController
@RequestMapping("/user")
public class UserController {
 

	@Autowired
	private RestTemplate restTemplate;
	
	List<User> users = new ArrayList<>();
	
	@GetMapping("/users")
	 
	public List<User> getAllUser() {
		
		users = Arrays.asList(new User(1,"mohan","butwal",100), new User(2, "sita", "pokhara",101), new User(3,"ram", "bangalore", 100));
		
		return users;
		
		
	}
	
	@GetMapping("user-department/{userId}")
	public UserAndDepartment getUserAndDepartment(@PathVariable Integer userId) {
		
		UserAndDepartment userDep =  null;
		for(User user: users) {
			if(user.getUserId() == userId) {
				
				System.out.println("fetching data from other service");
				
				Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/dep-info/"+user.getDepId(), Department.class);
				
				 userDep = new UserAndDepartment(user,department);
				
			}
		}
		return userDep;
	}
	
	
	//User Service failure fallback method
	public List<User> userServiceFallBack() {
		
		
		return null;
	}
}
