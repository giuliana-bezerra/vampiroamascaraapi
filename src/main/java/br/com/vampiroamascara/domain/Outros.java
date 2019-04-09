package br.com.vampiroamascara.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Outros {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToMany
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<QualidadeDefeito> qualidadesDefeitos;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto humanidade;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto forcaDeVontade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<QualidadeDefeito> getQualidadesDefeitos() {
		return qualidadesDefeitos;
	}

	public void setQualidadesDefeitos(List<QualidadeDefeito> qualidadesDefeitos) {
		this.qualidadesDefeitos = qualidadesDefeitos;
	}

	public Ponto getHumanidade() {
		return humanidade;
	}

	public void setHumanidade(Ponto humanidade) {
		this.humanidade = humanidade;
	}

	public Ponto getForcaDeVontade() {
		return forcaDeVontade;
	}

	public void setForcaDeVontade(Ponto forcaDeVontade) {
		this.forcaDeVontade = forcaDeVontade;
	}
}
