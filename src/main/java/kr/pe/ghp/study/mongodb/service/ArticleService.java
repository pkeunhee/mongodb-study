package kr.pe.ghp.study.mongodb.service;

import java.util.List;
import java.util.UUID;

import kr.pe.ghp.study.mongodb.domain.Article;
import kr.pe.ghp.study.mongodb.repository.ArticleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
	@Autowired
	private ArticleRepository articleRepository;

	public Article create(Article article) {
		article.setSeq(UUID.randomUUID().toString());
		return articleRepository.save(article);
	}

	public List<Article> getList() {
		return articleRepository.findAll();
	}
}
