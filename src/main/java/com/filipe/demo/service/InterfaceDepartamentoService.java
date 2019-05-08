package com.filipe.demo.service;

import java.util.List;

import com.filipe.demo.domain.Departamento;

public interface InterfaceDepartamentoService {
	
	void salvar(Departamento departamento);
	
	void editar(Departamento departamento);
	
	void excluir(Long id);
	
	Departamento buscarPorId(Long id);
	
	List<Departamento> buscarTodos();

	boolean departamentoTemCargos(Long id);

}
