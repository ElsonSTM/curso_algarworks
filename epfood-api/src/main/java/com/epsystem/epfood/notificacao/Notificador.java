package com.epsystem.epfood.notificacao;

import com.epsystem.epfood.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}