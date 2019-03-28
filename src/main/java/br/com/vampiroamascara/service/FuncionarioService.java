package br.com.vampiroamascara.service;

import org.springframework.http.ResponseEntity;

import br.com.vampiroamascara.domain.Funcionario;
import br.com.vampiroamascara.domain.FuncionarioInfo;

public interface FuncionarioService {
	ResponseEntity<Funcionario> buscarFuncionario(String nome);

	ResponseEntity<Funcionario> criarFuncionario(Funcionario funcionario);

	ResponseEntity<Funcionario> atualizarFuncionario(Funcionario funcionario);

	ResponseEntity<FuncionarioInfo> atualizarFuncionarioParcial(FuncionarioInfo funcionarioInfo);

	ResponseEntity<Funcionario> removerFuncionario(String nome);
}
