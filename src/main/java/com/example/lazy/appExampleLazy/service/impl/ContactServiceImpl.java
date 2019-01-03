package com.example.lazy.appExampleLazy.service.impl;

import org.springframework.stereotype.Service;

import com.example.lazy.appExampleLazy.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService{

	public ContactServiceImpl() {
		System.out.println("Instancia  ContactService");
	}
	
	@Override
	public String messageContact() {
		// TODO Auto-generated method stub
		return "message contact";
	}

}
