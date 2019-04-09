package br.com.vampiroamascara.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Atributos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Fisicos fisicos;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Sociais sociais;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Mentais mentais;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Fisicos getFisicos() {
		return fisicos;
	}

	public void setFisicos(Fisicos fisicos) {
		this.fisicos = fisicos;
	}

	public Sociais getSociais() {
		return sociais;
	}

	public void setSociais(Sociais sociais) {
		this.sociais = sociais;
	}

	public Mentais getMentais() {
		return mentais;
	}

	public void setMentais(Mentais mentais) {
		this.mentais = mentais;
	}
}
