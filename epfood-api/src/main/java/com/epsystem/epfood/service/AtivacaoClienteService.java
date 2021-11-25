package com.epsystem.epfood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epsystem.epfood.modelo.Cliente;
import com.epsystem.epfood.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	@Autowired(required = false)
	private Notificador notificador;
	
	//	@Autowired
	//	public AtivacaoClienteService(Notificador notificador) {
	//		this.notificador = notificador;
	//	}
	//	
	//	public AtivacaoClienteService(String qualquer) {
	//		
	//	}
	
		public void ativar(Cliente cliente) {
			cliente.ativar();
			
			if (notificador !=null) {
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		} else {
			System.out.println("Não existe notificador, mas cliente foi ativado");
		}
	
	}

//	@Autowired
//	public void setNotificador(Notificador notificador) {
//		this.notificador = notificador;
//	}
	
}
