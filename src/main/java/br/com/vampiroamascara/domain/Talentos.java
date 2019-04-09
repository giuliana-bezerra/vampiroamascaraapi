package br.com.vampiroamascara.domain;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Talentos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto prontidao;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto esportes;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto briga;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto esquiva;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto empatia;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto expressao;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto intimidacao;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto lideranca;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto manha;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto labia;
	private String prioridade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Ponto getProntidao() {
		return prontidao;
	}

	public void setProntidao(Ponto prontidao) {
		this.prontidao = prontidao;
	}

	public Ponto getEsportes() {
		return esportes;
	}

	public void setEsportes(Ponto esportes) {
		this.esportes = esportes;
	}

	public Ponto getBriga() {
		return briga;
	}

	public void setBriga(Ponto briga) {
		this.briga = briga;
	}

	public Ponto getEsquiva() {
		return esquiva;
	}

	public void setEsquiva(Ponto esquiva) {
		this.esquiva = esquiva;
	}

	public Ponto getEmpatia() {
		return empatia;
	}

	public void setEmpatia(Ponto empatia) {
		this.empatia = empatia;
	}

	public Ponto getExpressao() {
		return expressao;
	}

	public void setExpressao(Ponto expressao) {
		this.expressao = expressao;
	}

	public Ponto getIntimidacao() {
		return intimidacao;
	}

	public void setIntimidacao(Ponto intimidacao) {
		this.intimidacao = intimidacao;
	}

	public Ponto getLideranca() {
		return lideranca;
	}

	public void setLideranca(Ponto lideranca) {
		this.lideranca = lideranca;
	}

	public Ponto getManha() {
		return manha;
	}

	public void setManha(Ponto manha) {
		this.manha = manha;
	}

	public Ponto getLabia() {
		return labia;
	}

	public void setLabia(Ponto labia) {
		this.labia = labia;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}
}
