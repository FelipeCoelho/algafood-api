package com.algaworks.algafood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.algaworks.algafood.domain.model.FormaPagamento;
import com.algaworks.algafood.doman.repository.FormaPagamentoRepository;

@Component
public class FormaPagamentoRepositoryImpl implements FormaPagamentoRepository {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<com.algaworks.algafood.domain.model.FormaPagamento> listar() {
		return manager.createQuery("from FormaPagamento ", FormaPagamento.class).getResultList();
	}

	@Override
	public com.algaworks.algafood.domain.model.FormaPagamento buscar(Long id) {
		return manager.find(FormaPagamento.class, id);
	}

	@Override
	@Transactional
	public com.algaworks.algafood.domain.model.FormaPagamento FormaPagamento(FormaPagamento formaPagamento) {
		return manager.merge(formaPagamento);
	}

	@Override
	public void remover(com.algaworks.algafood.domain.model.FormaPagamento formaPagamento) {
		formaPagamento = buscar(formaPagamento.getId());
		manager.remove(formaPagamento);
	}

}
