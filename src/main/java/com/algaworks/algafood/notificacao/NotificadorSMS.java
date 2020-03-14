package com.algaworks.algafood.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;
import com.algaworks.algafood.modelo.Cliente;

@Qualifier("normal")
@Component
public class NotificadorSMS implements Notificador {
	

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do telefone %s: %s \n", cliente.getNome(), cliente.getTelefone(),
				mensagem);
	}
}
