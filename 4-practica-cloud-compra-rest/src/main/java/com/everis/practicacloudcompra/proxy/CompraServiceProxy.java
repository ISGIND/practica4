package com.everis.practicacloudcompra.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.everis.practicacloudcompra.response.CompraResponse;

//nombre de la aplicacion a la cual se conecta este servicio, en este caso es a inventario(servicio)
//en invetario properties tiene ese noombre 
// Se debe llamar igual que el propierties de inventario name
@FeignClient(name="PRACTICA-CLOUD-INVENTARIO-REST")
@RibbonClient(name = "PRACTICA-CLOUD-INVENTARIO-REST")

// url=https://whatzmeapi.com:10501
public interface CompraServiceProxy {
	
	//Metodos Creados en la  aplicacion de inventario, los sobre escribimos
	
	@GetMapping("/consultarInventario/producto/{id}")
	public CompraResponse retrieveInventario(@PathVariable int id);
	
	//  /rest/api/enviar-mensaje?877be9b47ac39dcbdac80d4fff18e554352abc13
	@PostMapping("/decrementar/producto/{id}/cantidad/{cantidad}")
	public CompraResponse retrieveDecrementar(@PathVariable int id, @PathVariable int cantidad);

	
	
}
