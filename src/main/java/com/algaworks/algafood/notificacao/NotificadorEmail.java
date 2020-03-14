package com.algaworks.algafood.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;

//@Primary
@Qualifier("urgente")
@Component
public class NotificadorEmail implements Notificador {
	

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s \n", cliente.getNome(), cliente.getEmail(),
				mensagem);
	}
}
