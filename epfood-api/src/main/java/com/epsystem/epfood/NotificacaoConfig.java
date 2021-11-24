package com.epsystem.epfood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epsystem.epfood.noticacao.NotificadorEmail;

@Configuration
public class NotificacaoConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.epmail.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
}
