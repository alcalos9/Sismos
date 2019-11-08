package com.examen.sismo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SismoController {
	
	
	@RequestMapping(value = "/sismos", method = RequestMethod.POST)
	public String helloWorld() {
		return "Hello World Sismos";
	}

}
