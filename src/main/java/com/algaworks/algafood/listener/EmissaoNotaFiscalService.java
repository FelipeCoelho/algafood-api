package com.algaworks.algafood.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.service.ClienteAtivadoEvent;

@Component
public class EmissaoNotaFiscalService {

	
	@EventListener
	public void clienteAtivadorListener(ClienteAtivadoEvent event) {
		System.out.println("Emitir nota fiscal para o cliente: "+event.getCliente().getNome() );
	}
}
