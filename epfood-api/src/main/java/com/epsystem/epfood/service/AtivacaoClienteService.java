package com.epsystem.epfood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epsystem.epfood.modelo.Cliente;
import com.epsystem.epfood.notificacao.NivelUrgencia;
import com.epsystem.epfood.notificacao.Notificador;
import com.epsystem.epfood.notificacao.TipoDoNotificador;

@Component
public class AtivacaoClienteService {

	@TipoDoNotificador(NivelUrgencia.NORMAL)
	@Autowired
	private Notificador notificador;
	
		public void ativar(Cliente cliente) {
			cliente.ativar();
			
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		}
	
}
