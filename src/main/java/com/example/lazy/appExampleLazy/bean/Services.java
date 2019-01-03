package com.example.lazy.appExampleLazy.bean;

import java.io.Serializable;

public class Services implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long codService;
	private String name;

	public long getCodService() {
		return codService;
	}

	public void setCodService(long codService) {
		this.codService = codService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
