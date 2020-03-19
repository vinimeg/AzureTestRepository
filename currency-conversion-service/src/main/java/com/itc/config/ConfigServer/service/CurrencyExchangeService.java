package com.itc.config.ConfigServer.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.itc.config.ConfigServer.model.CurrencyModel;


@FeignClient(name="currency-application")
@RibbonClient(name="currency-application")
public interface CurrencyExchangeService {
	
	@GetMapping("/exchange/getExchange/{INR}" )
	public ResponseEntity<CurrencyModel> getCurrencyExchange(@PathVariable("INR") Integer inr);

}
