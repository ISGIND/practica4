package com.everis.practicacloudcompra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.practicacloudcompra.model.Compra;
import com.everis.practicacloudcompra.repository.CompraRepository;

@Service
public class CompraService {
	
	@Autowired 
	CompraRepository compraRespository;
	
	public Compra insertar(Compra compra) {
		return compraRespository.save(compra);
		
	}
	
	

}
