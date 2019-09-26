package com.everis.practicacloudcompra.proxy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value="MensajeWhats" ,url="https://whatzmeapi.com:10501/rest/api/")
public class MensajeServiceProxy {
	
	
}
