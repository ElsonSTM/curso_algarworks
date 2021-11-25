package com.epsystem.epfood.notificacao;

import org.springframework.stereotype.Component;

import com.epsystem.epfood.modelo.Cliente;

//@Component
public class NotificadorEmail implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
