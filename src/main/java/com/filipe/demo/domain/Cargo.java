package com.filipe.demo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "CARGOS")
public class Cargo extends AbstractEntity<Long> {
	
	@Column(nullable = false, unique = true, length = 60)
	private String nome;

	@ManyToOne //Um para muitos.. A leitura é feita da direita para esquerda: ONE departamento TO MANY cargos
	@JoinColumn(name = "id_departamento_fk")//nome da coluna na tabela CARGO
	private Departamento departamento; //irá referenciar a chave estrangeira.

	@OneToMany(mappedBy = "cargo")
	private List<Funcionario> listaDeFuncionarios;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionario> getListaDeFuncionarios() {
		return listaDeFuncionarios;
	}

	public void setListaDeFuncionarios(List<Funcionario> listaDeFuncionarios) {
		this.listaDeFuncionarios = listaDeFuncionarios;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
