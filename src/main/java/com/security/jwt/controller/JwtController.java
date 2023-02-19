package com.security.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.jwt.entity.JwtRequest;
import com.security.jwt.entity.JwtResponse;
import com.security.jwt.service.JwtService;

@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
@RestController

public class JwtController {
	
	 @Autowired
	 private JwtService jwtService;

	    @PostMapping({"/authenticate"})
	    public JwtResponse  createJwtToken (@RequestBody JwtRequest jwtRequest) throws Exception {
	        return jwtService.createJwtToken(jwtRequest);
	    }
	
	
	
	
	
	
	
	
	
	

}
