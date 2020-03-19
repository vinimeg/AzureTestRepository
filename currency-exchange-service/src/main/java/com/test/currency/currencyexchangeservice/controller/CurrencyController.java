package com.test.currency.currencyexchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.currency.currencyexchangeservice.model.CurrencyModel;

@RestController
@RequestMapping(value = "/exchange")
public class CurrencyController {

	@Autowired
	private Environment env;
	
	
	@GetMapping("/getExchange/{INR}" )
	public ResponseEntity<CurrencyModel> getCurrencyExchange(@PathVariable("INR") Integer inr){
		
		CurrencyModel model= new CurrencyModel();
		model.setInr(inr);
		model.setUsd(inr*71);
		model.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return new ResponseEntity<CurrencyModel>(model, HttpStatus.ACCEPTED);
		
	}
	
}
