package com.jpa.hibernate.configuration;

import com.jpa.hibernate.service.LuceneIndexService;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManagerFactory;

public class LuceneIndexConfig {
    @Bean
    public LuceneIndexService luceneIndexService(EntityManagerFactory entityManagerFactory){
        LuceneIndexService luceneIndexServiceBean = new LuceneIndexService(entityManagerFactory);
        luceneIndexServiceBean.triggerIndexing();


        return luceneIndexServiceBean;
    }
}
