package com.everis.practicacloudinventario.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.practicacloudinventario.model.Inventario;
import com.everis.practicacloudinventario.reponses.InventarioResponse;
import com.everis.practicacloudinventario.service.InventarioService;

@RestController
public class InventarioController {

	@Autowired
	private InventarioService inventarioService;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/consultarInventario/producto/{id}")
	public InventarioResponse consultarInventario(@PathVariable int id) {
		InventarioResponse response = new InventarioResponse();
		
		try {
			Inventario valor = inventarioService.consultarInventario(id);
			if(valor == null) {
				response.setSuccessful(false);
				response.setMessage("Intente más tarde");
				return response;
			}
			
			response.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
			response.setMessage("Inventario recuperado");
			response.setSuccessful(true);
			response.setValue(valor);			
		} catch (Exception e) {
			// TODO: handle exception
			response.setSuccessful(false);
			response.setMessage(e.getMessage());
		}
		
		return response;
	}
	
	@PostMapping("/decrementar/producto/{id}/cantidad/{cantidad}")
	public InventarioResponse salidaProducto(@PathVariable int id, @PathVariable int cantidad) {
		Inventario inventario = inventarioService.consultarInventario(id);
		InventarioResponse response = new InventarioResponse();
		try {
			inventario.setStock((inventario.getStock())-cantidad);
			response.setValue(inventarioService.decrementar(inventario));
			response.setSuccessful(true);
			response.setMessage("Inventario Actualizado");
			
		} catch (Exception e) {
			// TODO: handle exception
			response.setMessage("Error, intentar mas tarde");
			response.setSuccessful(false);
		}
		response.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return response;
	}
	
	
	
	
}
