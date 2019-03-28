package br.com.vampiroamascara.domain;

public class UsuarioInfo {
	private String username;
	private String nome;
	private String email;

	public UsuarioInfo(Usuario user) {
		this.username = user.getUsername();
		this.nome = user.getNome();
		this.email = user.getEmail();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
