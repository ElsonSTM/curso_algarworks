package com.epsystem.epfood.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.epsystem.epfood.service.ClienteAtivadoEvent;

@Component
public class NotificacaoNotaFiscalService {
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		System.out.println("Emitindo nota fiscal para cliente " + event.getCliente().getNome());
		
	}
}
