package com.epsystem.epfood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.epsystem.epfood.modelo.Cliente;
import com.epsystem.epfood.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		
		System.out.println("MeuPrimeiroController " + ativacaoClienteService);
	}



	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente joao = new Cliente("João", "Joao@xyt.com", "852132569");
		
		ativacaoClienteService.Ativar(joao);
		
		return "Hello!";
	}

}
