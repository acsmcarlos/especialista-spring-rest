package com.antonio.algafood.di.service;

import org.springframework.stereotype.Component;

import com.antonio.algafood.di.model.Cliente;
import com.antonio.algafood.di.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {
	
	private NotificadorEmail notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema est� ativo!");
		
	}
}
