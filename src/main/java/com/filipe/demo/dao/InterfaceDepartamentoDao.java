package com.filipe.demo.dao;

import java.util.List;

import com.filipe.demo.domain.Departamento;

public interface InterfaceDepartamentoDao {
	
	void save(Departamento departamento);
	
	void update(Departamento departamento);
	
	void delete(Long id);
	
	Departamento findById(Long id);
	
	List<Departamento> findAll();
}
