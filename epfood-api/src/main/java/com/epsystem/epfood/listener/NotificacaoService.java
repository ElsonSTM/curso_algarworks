package com.epsystem.epfood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.epsystem.epfood.notificacao.NivelUrgencia;
import com.epsystem.epfood.notificacao.Notificador;
import com.epsystem.epfood.notificacao.TipoDoNotificador;
import com.epsystem.epfood.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@TipoDoNotificador(NivelUrgencia.URGENTE)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(),"Seu cadastro no sistema está ativo!");
		
	}
}
