package kr.pe.ghp.study.mongodb.repository;

import kr.pe.ghp.study.mongodb.domain.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
	User findByUsername(String username);
}
