package kr.pe.ghp.study.mongodb.repository;

import kr.pe.ghp.study.mongodb.domain.Role;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
}
