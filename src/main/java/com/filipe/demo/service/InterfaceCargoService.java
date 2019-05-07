package com.filipe.demo.service;

import java.util.List;

import com.filipe.demo.domain.Cargo;

public interface InterfaceCargoService {
	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();
}
