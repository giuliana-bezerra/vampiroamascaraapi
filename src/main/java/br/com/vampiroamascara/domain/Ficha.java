package br.com.vampiroamascara.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Ficha {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	private Usuario usuario;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Conceito conceito;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Atributos atributos;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Habilidades habilidades;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Outros outros;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Vantagens vantagens;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Preludio preludio;

	private int xp;

	public Ficha() {

	}

	public Ficha(Long id, Usuario usuario, Conceito conceito, Atributos atributos, Habilidades habilidades, Outros outros,
			Vantagens vantagens) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.conceito = conceito;
		this.atributos = atributos;
		this.habilidades = habilidades;
		this.outros = outros;
		this.vantagens = vantagens;
	}
}
