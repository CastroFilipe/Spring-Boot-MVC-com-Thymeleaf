package com.filipe.demo.service;

import java.util.List;

import com.filipe.demo.domain.Funcionario;

public interface InterfaceFuncionarioService {
	
	void salvar(Funcionario funcionario);
	
	void editar(Funcionario funcionario);
	
	void excluir(Long id);
	
	Funcionario buscarPorId(Long id);
	
	List<Funcionario> buscarTodos();
}
