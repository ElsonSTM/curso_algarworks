package com.epsystem.epfood.di.notificacao;

import com.epsystem.epfood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}