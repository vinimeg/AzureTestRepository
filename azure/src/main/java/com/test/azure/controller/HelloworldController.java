package com.test.azure.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class HelloworldController {

	
	@GetMapping(value="/getDetails", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getDetails(){
		
		return new ResponseEntity<String>("Hellow world",HttpStatus.OK);
	}
}
