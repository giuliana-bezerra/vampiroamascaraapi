package br.com.vampiroamascara.domain;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conhecimentos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto academicos;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto computador;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto financas;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto investigacao;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto direito;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto linguistica;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto medicina;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto ocultismo;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto politica;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto ciencia;
	private String prioridade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Ponto getAcademicos() {
		return academicos;
	}

	public void setAcademicos(Ponto academicos) {
		this.academicos = academicos;
	}

	public Ponto getComputador() {
		return computador;
	}

	public void setComputador(Ponto computador) {
		this.computador = computador;
	}

	public Ponto getFinancas() {
		return financas;
	}

	public void setFinancas(Ponto financas) {
		this.financas = financas;
	}

	public Ponto getInvestigacao() {
		return investigacao;
	}

	public void setInvestigacao(Ponto investigacao) {
		this.investigacao = investigacao;
	}

	public Ponto getDireito() {
		return direito;
	}

	public void setDireito(Ponto direito) {
		this.direito = direito;
	}

	public Ponto getLinguistica() {
		return linguistica;
	}

	public void setLinguistica(Ponto linguistica) {
		this.linguistica = linguistica;
	}

	public Ponto getMedicina() {
		return medicina;
	}

	public void setMedicina(Ponto medicina) {
		this.medicina = medicina;
	}

	public Ponto getOcultismo() {
		return ocultismo;
	}

	public void setOcultismo(Ponto ocultismo) {
		this.ocultismo = ocultismo;
	}

	public Ponto getPolitica() {
		return politica;
	}

	public void setPolitica(Ponto politica) {
		this.politica = politica;
	}

	public Ponto getCiencia() {
		return ciencia;
	}

	public void setCiencia(Ponto ciencia) {
		this.ciencia = ciencia;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

}
