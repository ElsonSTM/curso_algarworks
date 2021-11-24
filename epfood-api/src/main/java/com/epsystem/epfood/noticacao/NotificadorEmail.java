package com.epsystem.epfood.noticacao;

import com.epsystem.epfood.modelo.Cliente;

public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	private String hotsServidorSmtp;
	
	public NotificadorEmail(String hostServidorSmtp) {
		this.hotsServidorSmtp = hostServidorSmtp;
		System.out.println("Construtor chamado");
		System.out.println("NotificadorEmail");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.printf("Notificando %s atrav�s do e-mail %s usando SMTP %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), this.hotsServidorSmtp, mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}

}
