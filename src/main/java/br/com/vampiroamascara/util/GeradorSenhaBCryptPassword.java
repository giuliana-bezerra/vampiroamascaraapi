package br.com.vampiroamascara.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class GeradorSenhaBCryptPassword {
	private static final PasswordEncoder ENCODER = new BCryptPasswordEncoder();
	
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			// passwd - password from database
			System.out.println(encode("teste")); // print hash

			// true for all 5 iteration
			System.out.println(matche("teste", encode("teste")));
		}
	}
	
	public static String encode(String senhaTexto) {
		return ENCODER.encode(senhaTexto);
	}
	
	public static boolean matche(String senhaTexto, String senhaBCrypt) {
		return ENCODER.matches(senhaTexto, senhaBCrypt);
	}
}
