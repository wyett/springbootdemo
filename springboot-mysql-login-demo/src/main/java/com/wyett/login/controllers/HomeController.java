package com.wyett.login.controllers;

import java.util.List;

import com.wyett.login.entity.Users;
import com.wyett.login.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/Home")
@RestController
public class HomeController {
	@Autowired
	private UsersRepository usersRepository;

	@RequestMapping("/getAll")
	public List<Users> getAll() {
		List<Users> listUsers = (List<Users>) usersRepository.findAll();
		return listUsers;
	}
}
