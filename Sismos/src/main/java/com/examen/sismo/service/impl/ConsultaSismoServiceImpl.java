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
		try {
			url = new URL("https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2019-10-13&endtime=2019-10-14");
		
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
            String xx = response.toString(); 
            System.out.println(xx);
            
            Gson gson = new Gson();
            result = gson.fromJson(xx, Result.class);
            
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
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
		try {
			url = new URL("https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&minmagnitude=6.5&maxmagnitude=7");
		
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
            String xx = response.toString(); 
            System.out.println(xx);
            
            Gson gson = new Gson();
            result = gson.fromJson(xx, Result.class);
            
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
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
		
		try {
			for(int i=0; i<2; i++) {
				Result result = new Result();
				
				url = new URL("https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2019-10-13&endtime=2019-10-14");
			
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
	            String xx = response.toString(); 
	            System.out.println(xx);
	            
	            Gson gson = new Gson();
	            result = gson.fromJson(xx, Result.class);
	            
	            resultados.add(result);
			}			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			conn.disconnect();
		}		

		return resultados;
	}

}
