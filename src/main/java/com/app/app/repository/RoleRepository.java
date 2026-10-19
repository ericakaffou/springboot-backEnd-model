package com.app.app.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.app.app.model.Roles;

public interface RoleRepository  extends JpaRepository<Roles, Long>{
	
	Optional<Roles> findByRoleName(String roleName); 

}
