package com.algaworks.algafood.domain.repository;

import java.util.List;

import org.springframework.stereotype.Component;

import com.algaworks.algafood.domain.model.FormaPagamento;

@Component
public interface FormaPagamentoRepository {

	List<FormaPagamento> listar();
	FormaPagamento buscar(Long id);
	FormaPagamento FormaPagamento(FormaPagamento formaPagamento);
	void remover(FormaPagamento formaPagamento);
	
}
