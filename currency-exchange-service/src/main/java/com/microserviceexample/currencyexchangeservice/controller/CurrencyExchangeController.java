package com.microserviceexample.currencyexchangeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microserviceexample.currencyexchangeservice.bean.ExchangeService;
import com.microserviceexample.currencyexchangeservice.dao.ExchangeServiceRepository;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment env;
	
	@Autowired
	private ExchangeServiceRepository exSerDAO;
	
	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public ExchangeService exchangeCurrency(@PathVariable("from") String from ,@PathVariable("to") String to) {
		 ExchangeService ex= exSerDAO.findByFromAndTo(from, to);
		 ex.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		 return ex;
		
	}
}
