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

	@Test
	public void create() {
		Article article = new Article();
		article.setTitle("새글1");
		article.setContents("내용1");

		articleService.create(article);

		Article article2 = new Article();
		article2.setTitle("새글2");
		article2.setContents("내용2");

		articleService.create(article2);
	}

	@Test
	public void getList() {
		List<Article> result = articleService.getList();
		logger.debug(result.toString());
	}
}
