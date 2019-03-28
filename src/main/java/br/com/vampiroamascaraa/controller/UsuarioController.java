package br.com.vampiroamascaraa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.vampiroamascara.domain.Usuario;
import br.com.vampiroamascara.domain.UsuarioInfo;
import br.com.vampiroamascara.service.UsuarioService;

@RestController
@RequestMapping("/user")
public class UsuarioController {
	@Autowired
	private UsuarioService service;

	@GetMapping
	@RequestMapping("/public/{username}")
	public ResponseEntity<UsuarioInfo> buscarUser(@PathVariable(value = "username") String username) {
		return service.buscar(username);
	}

	@PostMapping
	@RequestMapping("/public")
	public ResponseEntity<Usuario> criarUser(@RequestBody Usuario user) {
		return service.criar(user);
	}

	@PutMapping
	@PreAuthorize("hasAuthority('ADMIN_USER')")
	public ResponseEntity<Usuario> atualizarUser(@RequestBody Usuario user) {
		return service.atualizar(user);
	}

	@PatchMapping
	@PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
	public ResponseEntity<UsuarioInfo> atualizarUserParcial(@RequestBody UsuarioInfo userInfo) {
		return service.atualizarParcial(userInfo);
	}

	@DeleteMapping(value = "/{username}")
	@PreAuthorize("hasAuthority('ADMIN_USER')")
	public ResponseEntity<Usuario> removerUser(@PathVariable(value = "username") String username) {
		return service.remover(username);
	}
}
