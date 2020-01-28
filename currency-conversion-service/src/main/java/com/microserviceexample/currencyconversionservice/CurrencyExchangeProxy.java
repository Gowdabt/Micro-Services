package com.microserviceexample.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microserviceexample.currencyconversionservice.bean.CurrencyConversion;

//@FeignClient(name="currency-exchange-service" , url = "localhost:8000")
@FeignClient(name="currency-exchange-service")//to which application we need to do rest call for that we are mentioning name
@RibbonClient(name="currency-exchange-service")//dynamically balance load to application
public interface CurrencyExchangeProxy {
	
	//@GetMapping("currency-exchange/from/{from}/to/{to}")
	
	//providing currency exchange service name before the access uri so that request can pass through zuul 
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion exchangeCurrency(@PathVariable("from") String from ,@PathVariable("to") String to);

}
