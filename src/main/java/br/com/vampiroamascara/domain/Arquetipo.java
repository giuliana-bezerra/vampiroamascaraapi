package br.com.vampiroamascara.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Arquetipo {
	@Id
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
