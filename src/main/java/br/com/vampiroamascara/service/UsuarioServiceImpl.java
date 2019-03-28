package br.com.vampiroamascara.service;

import java.net.URI;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.vampiroamascara.domain.Role;
import br.com.vampiroamascara.domain.Usuario;
import br.com.vampiroamascara.domain.UsuarioInfo;
import br.com.vampiroamascara.repository.UsuarioRepository;
import br.com.vampiroamascara.util.GeradorSenhaBCryptPassword;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	@Autowired
	private UsuarioRepository repository;

	@Override
	public ResponseEntity<UsuarioInfo> buscar(String username) {
		Usuario user = repository.findOne(username);
		if (user != null)
			return ResponseEntity.ok(new UsuarioInfo(user));
		else
			return ResponseEntity.notFound().build();
	}

	@Override
	public ResponseEntity<Usuario> pesquisar(String query) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Usuario> criar(Usuario usuario) {
		Usuario usuarioBD = repository.findOne(usuario.getUsername());
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{username}")
				.buildAndExpand(usuario.getUsername()).toUri();

		if (usuarioBD != null) {
			return new ResponseEntity<Usuario>(HttpStatus.SEE_OTHER);
		} else {
			ajustarDadosUsuario(usuario);
			repository.save(usuario);
			return ResponseEntity.created(location).build();
		}
	}

	private void ajustarDadosUsuario(Usuario usuario) {
		usuario.setRoles(new ArrayList<>());
		usuario.getRoles().add(new Role(2L));
		usuario.setPassword(GeradorSenhaBCryptPassword.encode(usuario.getPassword()));
	}

	@Override
	public ResponseEntity<Usuario> atualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<UsuarioInfo> atualizarParcial(UsuarioInfo usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<Usuario> remover(String username) {
		Usuario usuarioBD = repository.findOne(username);
		if (usuarioBD == null)
			return ResponseEntity.notFound().build();
		else {
			repository.delete(usuarioBD);
			return ResponseEntity.ok().build();
		}
	}
}
