package br.com.vampiroamascara.domain;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sociais {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String prioridade;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto carisma;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto manipulacao;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto aparencia;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public Ponto getCarisma() {
		return carisma;
	}

	public void setCarisma(Ponto carisma) {
		this.carisma = carisma;
	}

	public Ponto getManipulacao() {
		return manipulacao;
	}

	public void setManipulacao(Ponto manipulacao) {
		this.manipulacao = manipulacao;
	}

	public Ponto getAparencia() {
		return aparencia;
	}

	public void setAparencia(Ponto aparencia) {
		this.aparencia = aparencia;
	}

}
