package com.everis.practicacloudcompra.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.everis.practicacloudcompra.model.MensajeWhatsApp;
import com.everis.practicacloudcompra.response.MensajeResponse;

@FeignClient(value="MensajeWhats" ,url="https://whatzmeapi.com:10501/rest/api/enviar-mensaje?token=877be9b47ac39dcbdac80d4fff18e554352abc13")
public interface MensajeServiceProxy {
	
	@PostMapping(consumes = "application/json")
	public MensajeResponse retrieveMensaje(@RequestBody MensajeWhatsApp mensaje);
	
}
