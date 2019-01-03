package com.example.lazy.appExampleLazy.service.impl;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.example.lazy.appExampleLazy.service.ServicesService;

@Lazy
@Service
public class ServicesServiceImpl implements ServicesService{

	public ServicesServiceImpl() {
		System.out.println("Instancia  ServicesService");
	}
	
	@Override
	public String messageService() {
		// TODO Auto-generated method stub
		return "message services";
	}

}
