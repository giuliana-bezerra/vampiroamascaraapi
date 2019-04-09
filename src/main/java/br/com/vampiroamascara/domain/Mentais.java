package br.com.vampiroamascara.domain;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mentais {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String prioridade;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto percepcao;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto inteligencia;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto raciocinio;

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

	public Ponto getPercepcao() {
		return percepcao;
	}

	public void setPercepcao(Ponto percepcao) {
		this.percepcao = percepcao;
	}

	public Ponto getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(Ponto inteligencia) {
		this.inteligencia = inteligencia;
	}

	public Ponto getRaciocinio() {
		return raciocinio;
	}

	public void setRaciocinio(Ponto raciocinio) {
		this.raciocinio = raciocinio;
	}

}
