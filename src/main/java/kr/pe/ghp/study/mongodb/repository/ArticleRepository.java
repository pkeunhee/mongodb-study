package kr.pe.ghp.study.mongodb.repository;

import kr.pe.ghp.study.mongodb.domain.Article;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article, String> {

}
