package br.com.vampiroamascara.domain;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pericias {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto empatiaComAnimais;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto oficios;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto conducao;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto etiqueta;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto armasDeFogo;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto armasBrancas;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto performance;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto seguranca;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto furtividade;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto sobrevivencia;
	private String prioridade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Ponto getEmpatiaComAnimais() {
		return empatiaComAnimais;
	}

	public void setEmpatiaComAnimais(Ponto empatiaComAnimais) {
		this.empatiaComAnimais = empatiaComAnimais;
	}

	public Ponto getOficios() {
		return oficios;
	}

	public void setOficios(Ponto oficios) {
		this.oficios = oficios;
	}

	public Ponto getConducao() {
		return conducao;
	}

	public void setConducao(Ponto conducao) {
		this.conducao = conducao;
	}

	public Ponto getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(Ponto etiqueta) {
		this.etiqueta = etiqueta;
	}

	public Ponto getArmasDeFogo() {
		return armasDeFogo;
	}

	public void setArmasDeFogo(Ponto armasDeFogo) {
		this.armasDeFogo = armasDeFogo;
	}

	public Ponto getArmasBrancas() {
		return armasBrancas;
	}

	public void setArmasBrancas(Ponto armasBrancas) {
		this.armasBrancas = armasBrancas;
	}

	public Ponto getPerformance() {
		return performance;
	}

	public void setPerformance(Ponto performance) {
		this.performance = performance;
	}

	public Ponto getSeguranca() {
		return seguranca;
	}

	public void setSeguranca(Ponto seguranca) {
		this.seguranca = seguranca;
	}

	public Ponto getFurtividade() {
		return furtividade;
	}

	public void setFurtividade(Ponto furtividade) {
		this.furtividade = furtividade;
	}

	public Ponto getSobrevivencia() {
		return sobrevivencia;
	}

	public void setSobrevivencia(Ponto sobrevivencia) {
		this.sobrevivencia = sobrevivencia;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

}
