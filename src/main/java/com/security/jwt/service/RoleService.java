package com.security.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.jwt.dao.RoleDao;
import com.security.jwt.entity.Role;

@Service
public class RoleService {
	
	 @Autowired
	  private RoleDao roleDao;

	public Role createNewRole(Role role) {

		return roleDao.save(role);
	}

}
