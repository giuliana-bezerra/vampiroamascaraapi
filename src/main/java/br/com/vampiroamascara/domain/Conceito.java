package br.com.vampiroamascara.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Conceito {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String jogador;
	private String nome;
	private int geracao;
	@ManyToOne
	private Cla cla;
	@ManyToOne
	private Arquetipo natureza;
	@ManyToOne
	private Arquetipo comportamento;
	private String refugio;
	private String conceito;
	private String cronica;
	@ManyToOne
	private Mesa mesa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getJogador() {
		return jogador;
	}

	public void setJogador(String jogador) {
		this.jogador = jogador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getGeracao() {
		return geracao;
	}

	public void setGeracao(int geracao) {
		this.geracao = geracao;
	}

	public Cla getCla() {
		return cla;
	}

	public void setCla(Cla cla) {
		this.cla = cla;
	}

	public Arquetipo getNatureza() {
		return natureza;
	}

	public void setNatureza(Arquetipo natureza) {
		this.natureza = natureza;
	}

	public Arquetipo getComportamento() {
		return comportamento;
	}

	public void setComportamento(Arquetipo comportamento) {
		this.comportamento = comportamento;
	}

	public String getRefugio() {
		return refugio;
	}

	public void setRefugio(String refugio) {
		this.refugio = refugio;
	}

	public String getConceito() {
		return conceito;
	}

	public void setConceito(String conceito) {
		this.conceito = conceito;
	}

	public String getCronica() {
		return cronica;
	}

	public void setCronica(String cronica) {
		this.cronica = cronica;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	
}
