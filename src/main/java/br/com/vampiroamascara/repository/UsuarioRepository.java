package br.com.vampiroamascara.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vampiroamascara.domain.Usuario;

/**
 * Created by suman.das on 11/28/18.
 */
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
	Usuario findByUsername(String username);
}
