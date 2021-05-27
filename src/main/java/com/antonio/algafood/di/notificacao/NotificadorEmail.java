package com.antonio.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.antonio.algafood.di.model.Cliente;

@Component // componente gerenciado pelo spring
public class NotificadorEmail {
	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s, atrav�s do EMAIL: %s [%s]\n",
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
