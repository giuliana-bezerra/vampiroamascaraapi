package br.com.vampiroamascara.domain;

import javax.persistence.AttributeConverter;

public class PontoConverter implements AttributeConverter<Ponto, String> {
	private static final String SEPARATOR = ",";

	@Override
	public String convertToDatabaseColumn(Ponto pontoObj) {
		StringBuilder sb = new StringBuilder();
		sb.append(pontoObj.getNormal()).append(SEPARATOR).append(pontoObj.getBonus());
		return sb.toString();
	}

	@Override
	public Ponto convertToEntityAttribute(String pontoStr) {
		String[] ponto = pontoStr.split(SEPARATOR);
		return new Ponto(Integer.parseInt(ponto[0]), Integer.parseInt(ponto[1]));
	}

}
