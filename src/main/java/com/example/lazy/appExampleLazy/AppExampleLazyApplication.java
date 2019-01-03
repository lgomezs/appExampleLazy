package com.example.lazy.appExampleLazy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;

import com.example.lazy.appExampleLazy.service.ContactService;
import com.example.lazy.appExampleLazy.service.EmployeeServivce;
import com.example.lazy.appExampleLazy.service.ServicesService;

@SpringBootApplication
public class AppExampleLazyApplication implements CommandLineRunner{

	@Autowired private ContactService contactService;
	@Autowired private EmployeeServivce employeeServivce;
	@Lazy @Autowired private ServicesService servicesService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(AppExampleLazyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" ********************  ");
		System.out.println(contactService.messageContact());
		System.out.println(employeeServivce.messageEmployee());
		System.out.println(servicesService.messageService());
		
	}

}

