package br.com.vampiroamascara.domain;

public class Ponto {
	private int normal;
	private int bonus;
	
	public Ponto() {
		
	}
	
	public Ponto(int normal, int bonus) {
		this.normal = normal;
		this.bonus = bonus;
	}

	public int getNormal() {
		return normal;
	}

	public void setNormal(int normal) {
		this.normal = normal;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
}
