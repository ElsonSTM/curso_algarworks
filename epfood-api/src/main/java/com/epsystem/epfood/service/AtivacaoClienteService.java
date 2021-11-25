package com.epsystem.epfood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.epsystem.epfood.modelo.Cliente;
import com.epsystem.epfood.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	@Qualifier("SMS")
	@Autowired
	private Notificador notificador;
	
		public void ativar(Cliente cliente) {
			cliente.ativar();
			
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		}
	
}
