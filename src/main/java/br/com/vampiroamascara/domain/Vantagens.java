package br.com.vampiroamascara.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Vantagens {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Antecedentes> antecedentes;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Disciplinas> disciplinas;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Virtudes virtudes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Antecedentes> getAntecedentes() {
		return antecedentes;
	}

	public void setAntecedentes(List<Antecedentes> antecedentes) {
		this.antecedentes = antecedentes;
	}

	public List<Disciplinas> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplinas> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Virtudes getVirtudes() {
		return virtudes;
	}

	public void setVirtudes(Virtudes virtudes) {
		this.virtudes = virtudes;
	}
}
