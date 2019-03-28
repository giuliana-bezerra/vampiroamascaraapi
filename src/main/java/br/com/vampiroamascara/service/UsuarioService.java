package br.com.vampiroamascara.service;

import org.springframework.http.ResponseEntity;

import br.com.vampiroamascara.domain.Usuario;
import br.com.vampiroamascara.domain.UsuarioInfo;

public interface UsuarioService {
	ResponseEntity<UsuarioInfo> buscar(String username);
	ResponseEntity<Usuario> pesquisar(String query);
	ResponseEntity<Usuario> criar(Usuario usuario);
	ResponseEntity<Usuario> atualizar(Usuario usuario);
	ResponseEntity<UsuarioInfo> atualizarParcial(UsuarioInfo usuario);
	ResponseEntity<Usuario> remover(String username);
}
