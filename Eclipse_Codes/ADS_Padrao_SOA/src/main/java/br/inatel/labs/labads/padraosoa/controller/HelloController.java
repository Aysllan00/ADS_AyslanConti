package br.inatel.labs.labads.padraosoa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Spring controla(gerencia) as anotações Service, Controller, RestController
//Gerencia o ciclo de vida dessas classes (IoC)
@RestController
@RequestMapping("hello")
public class HelloController {
	
	@GetMapping
	public MyMessage processarGetHello() {
		
		MyMessage msg = new MyMessage(); //Spring não controla essa classe por não ter a anotação, entao é necesario dar new
		msg.setInfo("Ola, padrao Arquitetura SOA");
		return msg;
		
	}
}
