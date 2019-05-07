package com.filipe.demo.dao;

import java.util.List;

import com.filipe.demo.domain.Funcionario;

public interface InterfaceFuncionarioDao {
	
	void save(Funcionario funcionario);
	
	void update(Funcionario funcionario);
	
	void delete(Long id);
	
	Funcionario findById(Long id);
	
	List<Funcionario> findAll();
}
