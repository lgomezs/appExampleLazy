package com.example.lazy.appExampleLazy.service.impl;

import org.springframework.stereotype.Service;

import com.example.lazy.appExampleLazy.service.EmployeeServivce;

@Service
public class EmployeeServivceImpl implements EmployeeServivce{

	public EmployeeServivceImpl() {
		System.out.println("Instancia  EmployeeService");
	}
	
	@Override
	public String messageEmployee() {
		// TODO Auto-generated method stub
		return "message employee";
	}

}
