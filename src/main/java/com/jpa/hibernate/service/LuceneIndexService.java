package com.jpa.hibernate.service;


import com.jpa.hibernate.entity.Course;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.Search;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.stereotype.Service;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.util.List;


public class LuceneIndexService {

    @PersistenceContext
    private EntityManager entityManager;
    private FullTextEntityManager fullTextEntityManager;

    public LuceneIndexService(EntityManagerFactory entityManagerFactory) {
        this.fullTextEntityManager = Search.getFullTextEntityManager(entityManagerFactory.createEntityManager());
    }
    public void triggerIndexing() {
        try {
            fullTextEntityManager.createIndexer().startAndWait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Course> queryLucene(){

        QueryBuilder queryBuilder = fullTextEntityManager.getSearchFactory()
                .buildQueryBuilder()
                .forEntity(Course.class)
                .get();
        org.apache.lucene.search.Query query = queryBuilder
                .keyword()
                .onField("name")
                .matching("Steppes")
                .createQuery();
        org.hibernate.search.jpa.FullTextQuery jpaQuery
                = fullTextEntityManager.createFullTextQuery(query, Course.class);
        List<Course> result=jpaQuery.getResultList();
        System.out.println("The marching search is: "+result.toString());
        return  result;
    }




}
