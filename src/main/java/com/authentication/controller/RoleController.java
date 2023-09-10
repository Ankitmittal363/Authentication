package com.authentication.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.authentication.model.Role;
import com.authentication.service.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	
	@PostMapping("/createnewrole")
	public Role createNewRole(@RequestBody Role role) {
		return roleService.createNewRole(role);
		
	}

}
