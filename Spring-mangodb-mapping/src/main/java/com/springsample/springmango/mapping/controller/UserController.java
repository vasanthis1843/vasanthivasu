package com.springsample.springmango.mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springsample.springmango.mapping.model.User;
import com.springsample.springmango.mapping.repository.UserRepository;

@RestController
public class UserController {
    @Autowired
	private UserRepository repository;
	
	@PostMapping("/placeorder")
    public String placeOrder(@RequestBody User user)
    {
    	repository.save(user);
    	return "Order placed successfully";
    }

	@GetMapping("/getuserbyname/{name}")
	public List<User> getuserbyname(@PathVariable String name)
	{
		System.out.println(repository.findByName(name));	
		return repository.findByName(name);
	}
	@GetMapping("/getuserbycity/{city}")
	public List<User> getuserbyaddress(@PathVariable String city)
	{
		
		return repository.findByCity(city);
	} 
	
}
