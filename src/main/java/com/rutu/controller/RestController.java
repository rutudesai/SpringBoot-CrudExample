package com.rutu.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.rutu.model.User;
import com.rutu.services.UserService;

@org.springframework.web.bind.annotation.RestController 
public class RestController {
		
		@Autowired
		private UserService userService;
		
		@GetMapping("/")
		public String hello() {
			return "This is Home Page";
		}
		
		@GetMapping("/all-users")
		public List<User> getUsers(){
			return userService.getAllUser();
		}
		@GetMapping("/all-users/{id}")
		public Optional<User> getUserById(@PathVariable Integer id){
			return userService.getUserById(id);
		}
		@GetMapping("/save-user")
		public String saveUser(@RequestParam String username, @RequestParam String firstname, @RequestParam String lastname, @RequestParam int age, @RequestParam String password) {
			User user =new User(username,firstname,lastname,age,password);
			userService.saveMyUser(user);
			return "User is saved";
		}
		@GetMapping("/all-users/delete/{id}")
		public String deleteUserById(@PathVariable Integer id) {
			userService.delUserById(id);
			return "User Deleted";
		}
		
		
}
