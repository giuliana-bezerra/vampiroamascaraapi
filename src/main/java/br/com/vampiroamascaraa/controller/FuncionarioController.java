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

import br.com.vampiroamascara.domain.Funcionario;
import br.com.vampiroamascara.domain.FuncionarioInfo;
import br.com.vampiroamascara.service.FuncionarioService;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
	@Autowired
	private FuncionarioService service;
	
	@GetMapping
	@RequestMapping("/public/{nome}")
//	@PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
	public ResponseEntity<Funcionario> buscarFuncionario(@PathVariable(value = "nome") String nome) {
		return service.buscarFuncionario(nome);
	}

	@PostMapping
	@PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
	public ResponseEntity<Funcionario> criarFuncionario(@RequestBody Funcionario funcionario) {
		return service.criarFuncionario(funcionario);
	}

	@PutMapping
	@PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
	public ResponseEntity<Funcionario> atualizarFuncionario(@RequestBody Funcionario funcionario) {
		return service.atualizarFuncionario(funcionario);
	}

	@PatchMapping
	@PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
	public ResponseEntity<FuncionarioInfo> atualizarFuncionarioParcial(@RequestBody FuncionarioInfo funcionarioInfo) {
		return service.atualizarFuncionarioParcial(funcionarioInfo);
	}

	@DeleteMapping(value = "/{nome}")
	@PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
	public ResponseEntity<Funcionario> removerFuncionario(@PathVariable(value = "nome") String nome) {
		return service.removerFuncionario(nome);
	}
}
