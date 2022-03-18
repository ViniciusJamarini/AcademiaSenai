package br.com.senai.academiasenai.entity;

import java.time.LocalDate;

public class Professor {

	private Integer id;
	private String nome;
	private LocalDate dataDeCasamento;
	
	public Professor(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}
	public LocalDate getDataDeCasamento() {
		return dataDeCasamento;
	}
	public void setDataDeCasamento(LocalDate dataDeCasamento) {
		this.dataDeCasamento = dataDeCasamento;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}	
