package br.com.vampiroamascara.domain;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fisicos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String prioridade;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto forca;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto destreza;
	@Column
	@Convert(converter = PontoConverter.class)
	private Ponto vigor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	public Ponto getForca() {
		return forca;
	}

	public void setForca(Ponto forca) {
		this.forca = forca;
	}

	public Ponto getDestreza() {
		return destreza;
	}

	public void setDestreza(Ponto destreza) {
		this.destreza = destreza;
	}

	public Ponto getVigor() {
		return vigor;
	}

	public void setVigor(Ponto vigor) {
		this.vigor = vigor;
	}

}
