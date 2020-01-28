package com.microserviceexample.currencyexchangeservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microserviceexample.currencyexchangeservice.bean.ExchangeService;

public interface ExchangeServiceRepository extends JpaRepository<ExchangeService, Long> {
	
	ExchangeService findByFromAndTo(String from,String to);

}
