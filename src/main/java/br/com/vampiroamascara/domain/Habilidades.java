package br.com.vampiroamascara.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Habilidades {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Talentos talentos;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Pericias pericias;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Conhecimentos conhecimentos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Talentos getTalentos() {
		return talentos;
	}

	public void setTalentos(Talentos talentos) {
		this.talentos = talentos;
	}

	public Pericias getPericias() {
		return pericias;
	}

	public void setPericias(Pericias pericias) {
		this.pericias = pericias;
	}

	public Conhecimentos getConhecimentos() {
		return conhecimentos;
	}

	public void setConhecimentos(Conhecimentos conhecimentos) {
		this.conhecimentos = conhecimentos;
	}
}
