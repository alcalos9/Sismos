package com.examen.sismo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.examen.sismo.entity.request.ConsultaCuantroFechasRequest;
import com.examen.sismo.entity.request.ConsultaDosFechasRequest;
import com.examen.sismo.entity.request.ConsultaMagnitudRequest;
import com.examen.sismo.response.Result;
import com.examen.sismo.service.ConsultaSismoService;

@RestController
public class SismoController {
	
	@Autowired
	ConsultaSismoService consultaSismoService;
	
	@RequestMapping(value = "/sismos", method = RequestMethod.POST)
	public String helloWorld() {
		return "Hello World Sismos";
	}
	
	@RequestMapping(value = "/consultaDosFechas", method = RequestMethod.POST)
	public Result consultaDosFechas(@RequestBody ConsultaDosFechasRequest consultaDosFechasRequest){

		Result resultado = consultaSismoService.consultaDosFechas(consultaDosFechasRequest);			
		return resultado;

	}
	
	@RequestMapping(value = "/consultaMagnitudes", method = RequestMethod.POST)
	public Result consultaMagnitudes(@RequestBody ConsultaMagnitudRequest consultaMagnitudRequest){

		Result resultado = consultaSismoService.consultaMagnitudes(consultaMagnitudRequest);			
		return resultado;
	
	}
	
	@RequestMapping(value = "/consultaCuatroFechas", method = RequestMethod.POST)
	public List<Result> consultaCuatroFechas(@RequestBody ConsultaCuantroFechasRequest consultaCuantroFechasRequest){

		List<Result> resultados = new ArrayList<Result>();	
		resultados = consultaSismoService.consultaCuatroFechas(consultaCuantroFechasRequest);			
		return resultados;
	
	}

}
