package com.examen.sismo.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examen.sismo.entity.request.ConsultaCuantroFechasRequest;
import com.examen.sismo.entity.request.ConsultaDosFechasRequest;
import com.examen.sismo.entity.request.ConsultaMagnitudRequest;
import com.examen.sismo.response.Result;
import com.examen.sismo.service.ConsultaSismoService;

import com.examen.sismo.dto.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

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
	
	@RequestMapping(value = "/consultaSismosOctubre", method = RequestMethod.POST)
	public List<Result> consultaSismosOctubre(){

		List<Result> resultados = new ArrayList<Result>();	
		resultados = consultaSismoService.consultaSismosOctubre();			
		return resultados;
	
	}
	
	@PostMapping("user")
	public User login(@RequestParam("user") String username, @RequestParam("password") String pwd) {
		
		String token = getJWTToken(username);
		User user = new User();
		user.setUser(username);
		user.setToken(token);		
		return user;
		
	}
	
	private String getJWTToken(String username) {
		String secretKey = "sismosGlobalLogic";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
				.commaSeparatedStringToAuthorityList("ROLE_USER");
		
		String token = Jwts
				.builder()
				.setId("softtekJWT")
				.setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 800000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return "Sismos " + token;	
	}

}
