package com.ldp.es.repository;

import com.ldp.es.bean.Article;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @author T-liudp
 * @create 2022-03-26 12:18
 */

public interface  ArticleRepository extends ElasticsearchRepository<Article,Long> {
    List<Article> findByTitle(String title);
    List<Article> findByTitleOrContent(String title, String content);
    List<Article> findByTitleOrContent(String title, String content, Pageable pageable);
}
