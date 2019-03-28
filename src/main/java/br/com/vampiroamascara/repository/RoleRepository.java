package br.com.vampiroamascara.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.vampiroamascara.domain.Role;

/**
 * Created by suman.das on 11/28/18.
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
}
