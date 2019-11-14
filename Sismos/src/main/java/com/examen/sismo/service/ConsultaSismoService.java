package com.examen.sismo.service;

import java.util.List;

import com.examen.sismo.entity.request.ConsultaCuantroFechasRequest;
import com.examen.sismo.entity.request.ConsultaDosFechasRequest;
import com.examen.sismo.entity.request.ConsultaMagnitudRequest;
import com.examen.sismo.response.Result;

public interface ConsultaSismoService {

	Result consultaDosFechas(ConsultaDosFechasRequest consultaDosFechasRequest);

	Result consultaMagnitudes(ConsultaMagnitudRequest consultaMagnitudRequest);

	List<Result> consultaCuatroFechas(ConsultaCuantroFechasRequest consultaCuantroFechasRequest);

	List<Result> consultaSismosOctubre();

}
