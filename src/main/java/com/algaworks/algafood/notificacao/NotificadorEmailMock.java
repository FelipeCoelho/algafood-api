package com.algaworks.algafood.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.modelo.Cliente;

//@Primary
//@Qualifier("urgente")
@Profile("dev")
@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmailMock implements Notificador {
	
	public NotificadorEmailMock() {
		System.out.println("notificador de email mock");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Mock: Notificando %s seria enviada através do e-mail %s: %s \n", cliente.getNome(), cliente.getEmail(),
				mensagem);
	}
}
