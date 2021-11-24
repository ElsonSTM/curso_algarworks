package com.epsystem.epfood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.epsystem.epfood.noticacao.Notificador;
import com.epsystem.epfood.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {

	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}
}
