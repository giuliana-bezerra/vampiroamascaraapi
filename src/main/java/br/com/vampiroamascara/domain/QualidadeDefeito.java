package br.com.vampiroamascara.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class QualidadeDefeito {
	@Id
	private String nome;
	private int pontos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
}
