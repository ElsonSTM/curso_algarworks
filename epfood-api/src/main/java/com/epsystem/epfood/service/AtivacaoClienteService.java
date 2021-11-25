package com.epsystem.epfood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epsystem.epfood.modelo.Cliente;
import com.epsystem.epfood.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	@Autowired
	private List<Notificador> notificadores;
	
		public void ativar(Cliente cliente) {
			cliente.ativar();
			
			for (Notificador notificar : notificadores) {
				notificar.notificar(cliente, "Seu cadastro no sistema está ativo!");
			}
		}
}
		
