package br.com.senai.academiasenai.entity;

import java.time.LocalDate;

public class Professor {

	private Integer id;
	private String nome;
	private LocalDate dataDeAdmissao;
	
	public Professor(Integer id, String nome, LocalDate dataDeAdmissao) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataDeAdmissao = dataDeAdmissao;
	}
	public Integer getId() {
		return id;
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
	public LocalDate getDataDeAdmissao() {
		return dataDeAdmissao;
	}
	public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
	
	
	
}	
