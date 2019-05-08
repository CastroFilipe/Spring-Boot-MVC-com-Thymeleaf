package com.filipe.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.filipe.demo.dao.InterfaceDepartamentoDao;
import com.filipe.demo.domain.Departamento;

@Service @Transactional(readOnly = false)
public class DepartamentoServiceImpl implements InterfaceDepartamentoService{
	
	@Autowired
	private InterfaceDepartamentoDao dao;

	@Override
	public void salvar(Departamento departamento) {
		dao.save(departamento);
	}

	@Override
	public void editar(Departamento departamento) {
		dao.update(departamento);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override @Transactional(readOnly = true)
	public Departamento buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Departamento> buscarTodos() {
		return dao.findAll();
	}

	@Override
	public boolean departamentoTemCargos(Long id) {
		if(buscarPorId(id).getListaDeCargos().isEmpty()) {
			return false;
		}
		
		return true;
	}

}
