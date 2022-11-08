package br.inatel.labs.labads.padraomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OlaMundoController {
	
	@GetMapping("/ola") //Request do controller
	public String getOla(Model model) { //Model do mvc - Injeção de dependencia
		
		model.addAttribute("usuario", "Ayslan"); 
		
		return "ola-mundo"; //Procurar pela arquivo ola-mundo.html 
	}						//Renderiza a pagina para gerar a resposta para o navegador
	
}
