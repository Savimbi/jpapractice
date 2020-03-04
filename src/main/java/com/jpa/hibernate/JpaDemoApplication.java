package com.jpa.hibernate;

import com.jpa.hibernate.configuration.LuceneIndexConfig;
import com.jpa.hibernate.entity.Course;
import com.jpa.hibernate.repository.CourseRepository;
import com.jpa.hibernate.service.LuceneIndexService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;

@EntityScan({"com.jpa.hibernate.entity"})
@SpringBootApplication
@Import(LuceneIndexConfig.class)
public class JpaDemoApplication implements CommandLineRunner {


	private Logger logger= LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CourseRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Course course = repository.findById(10001L);
		logger.info("Course 10001 ->{}", course);


//		repository.save(new Course("Microservices in 100 steps"));

	}
}
