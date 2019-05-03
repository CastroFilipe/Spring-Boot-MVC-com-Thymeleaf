package com.filipe.demo.dao;

import java.util.List;

import com.filipe.demo.domain.Cargo;

public interface InterfaceCargoDao {
	
	void save(Cargo cargo);
	
	void update(Cargo cargo);
	
	void delete(Long id);
	
	List<Cargo> findAll();
}
