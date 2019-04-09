package br.com.vampiroamascara.domain;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Virtudes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto consciencia;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto autocontrole;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto coragem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Ponto getConsciencia() {
		return consciencia;
	}

	public void setConsciencia(Ponto consciencia) {
		this.consciencia = consciencia;
	}

	public Ponto getAutocontrole() {
		return autocontrole;
	}

	public void setAutocontrole(Ponto autocontrole) {
		this.autocontrole = autocontrole;
	}

	public Ponto getCoragem() {
		return coragem;
	}

	public void setCoragem(Ponto coragem) {
		this.coragem = coragem;
	}
}
