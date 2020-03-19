package com.itc.config.ConfigServer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itc.config.ConfigServer.configuration.LimitModel;
import com.itc.config.ConfigServer.configuration.LimitServiceConfiguration;
import com.itc.config.ConfigServer.model.CurrencyModel;
import com.itc.config.ConfigServer.service.CurrencyExchangeService;

@RestController
@RequestMapping(value="/conversion")
public class LimitRestController {

	@Autowired
	LimitServiceConfiguration config;
	
	@Autowired
	private CurrencyExchangeService service;
	
	@GetMapping(path="/getData")
	public ResponseEntity<LimitModel> getDetail(){
		
		LimitModel model= new LimitModel();
		
		model.setMax(config.getMaximum());
		model.setMin(config.getMinimum());
		
		return new ResponseEntity<>(model, HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/getExchange/{INR}" )
	public ResponseEntity<CurrencyModel> getCurrencyExchange(@PathVariable("INR") Integer inr){
		
		
		return service.getCurrencyExchange(inr);
		
		
		
	}
	
}
