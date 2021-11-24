package com.epsystem.epfood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epsystem.epfood.noticacao.NotificadorEmail;
import com.epsystem.epfood.service.AtivacaoClienteService;

//@Configuration
public class EpConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.epmail.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificadorEmail());
	}
}
