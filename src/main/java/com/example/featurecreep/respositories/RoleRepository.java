package com.example.featurecreep.respositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.featurecreep.models.ERole;
import com.example.featurecreep.models.Role;

public interface RoleRepository extends MongoRepository<Role, String>{
	Optional<Role> findByName(ERole name);
}
