package kr.pe.ghp.study.mongodb.service;

import java.util.List;

import kr.pe.ghp.study.mongodb.domain.Article;
import kr.pe.ghp.study.mongodb.test.BaseTestCase;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author geunhui park
 *
 */
public class ArticleServiceTest extends BaseTestCase {
	private static Logger logger = LoggerFactory.getLogger(ArticleServiceTest.class);

	@Autowired
	private ArticleService articleService;

	//@Test
	public void create() {
		Article article = new Article();
		articleService.create(article);
	}

	@Test
	public void getList() {
		List<Article> result = articleService.getList();
		logger.debug(result.toString());
	}
}
