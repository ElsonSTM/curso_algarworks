package com.epsystem.epfood.service;

import org.springframework.stereotype.Component;

import com.epsystem.epfood.modelo.Cliente;
import com.epsystem.epfood.noticacao.Notificador;

public class AtivacaoClienteService {
	
	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		
		System.out.println("AtivacaoClienteService" + notificador);
	}

	public void Ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
