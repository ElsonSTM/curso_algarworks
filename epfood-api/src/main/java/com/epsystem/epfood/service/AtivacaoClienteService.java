package com.epsystem.epfood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.epsystem.epfood.modelo.Cliente;

@Component
public class AtivacaoClienteService {
		
		@Autowired
		private ApplicationEventPublisher eventPublisher;
		
		public void ativar(Cliente cliente) {
			cliente.ativar();
			
			// Dizer para o container que o cliente está ativo neste momento
		
			eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
		}
	
}
