package br.com.vampiroamascara.service;

import java.lang.reflect.Field;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.vampiroamascara.domain.Funcionario;
import br.com.vampiroamascara.domain.FuncionarioInfo;

/**
 * Serviço capaz de criar, atualizar, deletar e recuperar funcionários. A
 * persistência dos dados é feita em memória.
 * 
 * @author giuliana.bezerra
 *
 */
@Service
public class FuncionarioServiceImpl implements FuncionarioService {
	private List<Funcionario> funcionarios = new ArrayList<>();

	public ResponseEntity<Funcionario> buscarFuncionario(String nome) {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getNome().equals(nome))
				return ResponseEntity.ok(funcionario);
		}
		return ResponseEntity.notFound().build();
	}

	public ResponseEntity<Funcionario> criarFuncionario(Funcionario funcionario) {
		Boolean criado = criar(funcionario);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{nome}")
				.buildAndExpand(funcionario.getNome()).toUri();
		if (criado) {
			return ResponseEntity.created(location).build();
		} else {
			return ResponseEntity.status(HttpStatus.SEE_OTHER).location(location).build();
		}
	}

	public ResponseEntity<Funcionario> atualizarFuncionario(Funcionario funcionario) {
		if (atualizarCompleto(funcionario))
			return ResponseEntity.ok(funcionario);
		else
			return ResponseEntity.notFound().build();
	}

	public ResponseEntity<FuncionarioInfo> atualizarFuncionarioParcial(FuncionarioInfo funcionarioInfo) {
		if (atualizarParcial(funcionarioInfo))
			return ResponseEntity.ok(funcionarioInfo);
		else
			return ResponseEntity.notFound().build();
	}

	public ResponseEntity<Funcionario> removerFuncionario(String nome) {
		Funcionario funcionario = remover(nome);
		if (funcionario == null)
			return ResponseEntity.notFound().build();
		else
			return ResponseEntity.ok().build();
	}

	private Boolean criar(Funcionario funcionario) {
		if (!funcionarios.contains(funcionario))
			return funcionarios.add(funcionario);
		else
			return false;
	}

	private Boolean atualizarCompleto(Funcionario funcionarioCompleto) {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getNome().equals(funcionarioCompleto.getNome())) {
				BeanUtils.copyProperties(funcionarioCompleto, funcionario);
				return true;
			}
		}
		return false;
	}

	private Funcionario remover(String nome) {
		Iterator<Funcionario> it = funcionarios.iterator();
		while (it.hasNext()) {
			Funcionario funcionario = it.next();
			if (funcionario.getNome().equals(nome)) {
				it.remove();
				return funcionario;
			}
		}
		return null;
	}

	private Boolean atualizarParcial(FuncionarioInfo funcionarioInfo) {
		for (Funcionario funcionario : funcionarios) {
			if (funcionario.getNome().equals(funcionarioInfo.getNome())) {
				BeanUtils.copyProperties(funcionarioInfo, funcionario, getNullProperties(funcionarioInfo));
				return true;
			}
		}
		return false;
	}

	private String[] getNullProperties(FuncionarioInfo funcionarioInfo) {
		List<String> nullPropertiesList = new ArrayList<>();
		String[] nullPropertiesArray = new String[] {};
		try {
			for (Field field : funcionarioInfo.getClass().getDeclaredFields()) {
				field.setAccessible(true);
				Object attribute = field.get(funcionarioInfo);
				if (attribute == null) {
					nullPropertiesList.add(field.getName());
				}
			}
		} catch (Exception e) {
			// DO NOTHING!
		}
		return nullPropertiesList.toArray(nullPropertiesArray);
	}
}
