package com.filipe.demo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@SuppressWarnings("serial")
@Entity
@Table(name = "DEPARTAMENTOS")//indica que a classe Departamento será mapeada a partir da tabela DEPARTAMENTO do banco.
public class Departamento extends AbstractEntity<Long> {
	
	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;
	
	@OneToMany(mappedBy = "departamento")
	private List<Cargo> listaDeCargos;

	public List<Cargo> getListaDeCargos() {
		return listaDeCargos;
	}

	public void setListaDeCargos(List<Cargo> listaDeCargos) {
		this.listaDeCargos = listaDeCargos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
