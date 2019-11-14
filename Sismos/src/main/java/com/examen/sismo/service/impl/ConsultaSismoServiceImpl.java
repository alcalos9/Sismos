package com.examen.sismo.service.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.examen.sismo.entity.request.ConsultaCuantroFechasRequest;
import com.examen.sismo.entity.request.ConsultaDosFechasRequest;
import com.examen.sismo.entity.request.ConsultaMagnitudRequest;
import com.examen.sismo.response.Result;
import com.examen.sismo.service.ConsultaSismoService;
import com.google.gson.Gson;


@Service
public class ConsultaSismoServiceImpl implements ConsultaSismoService {
	


	@Override
	public Result consultaDosFechas(ConsultaDosFechasRequest consultaDosFechasRequest) {

		URL url;
		HttpURLConnection conn = null;
		Result result = new Result();
		
		//"https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2019-10-13&endtime=2019-10-14"
		String direccion = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime="+consultaDosFechasRequest.getFechaInicioR1()+"&endtime="+consultaDosFechasRequest.getFechaTerminoR1();
		
		try {			
			url = new URL(direccion);
		
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("content-type", "application/json; charset=utf-8");
			
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));			
			
			StringBuilder response = new StringBuilder();
			String responseSingle = null; 
            while ((responseSingle = br.readLine()) != null)  
            { 
                response.append(responseSingle); 
            } 
            String resultado = response.toString(); 
            
            Gson gson = new Gson();
            result = gson.fromJson(resultado, Result.class);
            
			
		} catch (Exception e) {
			// Solamente se agrega el mensaje de error para que se muetre por pantalla
			// Lo correcto es que el objeto de salida tengo un atributo exclusivo para el mensaje
			e.printStackTrace();
			result.setType(e.getMessage());
			return result;
		}finally {
			conn.disconnect();
		}		

		return result;
	}

	@Override
	public Result consultaMagnitudes(ConsultaMagnitudRequest consultaMagnitudRequest) {
		URL url;
		HttpURLConnection conn = null;
		Result result = new Result();
		//"https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&minmagnitude=6.5&maxmagnitude=7"
		String direccion = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&minmagnitude="+consultaMagnitudRequest.getMinMagnitude()+"&maxmagnitude="+consultaMagnitudRequest.getMaxMagnitude();
		try {
			url = new URL(direccion);
		
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("content-type", "application/json; charset=utf-8");
			
			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));			
			
			StringBuilder response = new StringBuilder();
			String responseSingle = null; 
            while ((responseSingle = br.readLine()) != null)  
            { 
                response.append(responseSingle); 
            } 
            String resultado = response.toString(); 
            
            Gson gson = new Gson();
            result = gson.fromJson(resultado, Result.class);
            
			
		} catch (Exception e) {
			// Solamente se agrega el mensaje de error para que se muetre por pantalla
			// Lo correcto es que el objeto de salida tengo un atributo exclusivo para el mensaje
			e.printStackTrace();
			result.setType(e.getMessage());
			return result;
		}finally {
			conn.disconnect();
		}		

		return result;
	}

	
	@Override
	public List<Result> consultaCuatroFechas(ConsultaCuantroFechasRequest consultaCuantroFechasRequest) {
		URL url;
		HttpURLConnection conn = null;
		List<Result> resultados = new ArrayList<Result>();
		
		//"https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2019-10-13&endtime=2019-10-14"
		String direccion = "";
				
		try {
			for(int i=0; i<2; i++) {
				Result result = new Result();
				
				if(i==0) {
					direccion = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime="+consultaCuantroFechasRequest.getFechaInicioR1()+"&endtime="+consultaCuantroFechasRequest.getFechaTerminoR1();
				}else {
					direccion = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime="+consultaCuantroFechasRequest.getFechaInicioR2()+"&endtime="+consultaCuantroFechasRequest.getFechaTerminoR2();
				}
				
				url = new URL(direccion);
			
				conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.setRequestProperty("content-type", "application/json; charset=utf-8");
				
				BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));			
				
				StringBuilder response = new StringBuilder();
				String responseSingle = null; 
	            while ((responseSingle = br.readLine()) != null)  
	            { 
	                response.append(responseSingle); 
	            } 
	            String resultado = response.toString(); 
	            
	            Gson gson = new Gson();
	            result = gson.fromJson(resultado, Result.class);
	            
	            resultados.add(result);
			}			
		} catch (Exception e) {
			// Solamente se agrega el mensaje de error para que se muetre por pantalla
			// Lo correcto es que el objeto de salida tengo un atributo exclusivo para el mensaje
			e.printStackTrace();
			Result r = new Result();
			r.setType(e.getMessage());
			resultados.add(r);
			return resultados;
		}finally {
			conn.disconnect();
		}		

		return resultados;
	}

	@Override
	public List<Result> consultaSismosOctubre() {
		URL url;
		HttpURLConnection conn = null;
		List<Result> resultados = new ArrayList<Result>();
		
		//"https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2019-10-13&endtime=2019-10-14"
		String direccion = "";
				
		try {
			for(int i=0; i<2; i++) {
				Result result = new Result();
				
				if(i==0) {
					direccion = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2019-10-01&endtime=2019-10-03";
				}else {
					direccion = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2019-10-06&endtime=2019-10-14";
				}
				
				url = new URL(direccion);
			
				conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod("GET");
				conn.setRequestProperty("content-type", "application/json; charset=utf-8");
				
				BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));			
				
				StringBuilder response = new StringBuilder();
				String responseSingle = null; 
	            while ((responseSingle = br.readLine()) != null)  
	            { 
	                response.append(responseSingle); 
	            } 
	            String resultado = response.toString(); 
	            
	            Gson gson = new Gson();
	            result = gson.fromJson(resultado, Result.class);
	            
	            resultados.add(result);
			}			
		} catch (Exception e) {
			// Solamente se agrega el mensaje de error para que se muetre por pantalla
			// Lo correcto es que el objeto de salida tengo un atributo exclusivo para el mensaje
			e.printStackTrace();
			Result r = new Result();
			r.setType(e.getMessage());
			resultados.add(r);
			return resultados;
		}finally {
			conn.disconnect();
		}		

		return resultados;
	}

}
