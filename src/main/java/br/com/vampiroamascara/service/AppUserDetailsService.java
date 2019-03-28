package br.com.vampiroamascara.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import br.com.vampiroamascara.domain.Usuario;
import br.com.vampiroamascara.repository.UsuarioRepository;

/**
 * Created by suman.das on 11/28/18.
 */
@Component
public class AppUserDetailsService implements UserDetailsService {
	@Autowired
	private UsuarioRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
		Usuario user = userRepository.findByUsername(s);

		if (user == null) {
			throw new UsernameNotFoundException(String.format("The username %s doesn't exist", s));
		}

		List<GrantedAuthority> authorities = new ArrayList<>();
		user.getRoles().forEach(role -> {
			authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
		});

		UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUsername(),
				user.getPassword(), authorities);

		return userDetails;
	}
}
