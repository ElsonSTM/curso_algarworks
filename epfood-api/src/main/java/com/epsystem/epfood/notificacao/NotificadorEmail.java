package com.epsystem.epfood.notificacao;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;

import com.epsystem.epfood.modelo.Cliente;


@Qualifier("email")
@Component
public class NotificadorEmail implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
