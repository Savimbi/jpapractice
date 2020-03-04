package com.jpa.hibernate;

import com.jpa.hibernate.entity.Course;
import com.jpa.hibernate.repository.CourseRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


@SpringBootTest(classes = JpaDemoApplication.class)
class CourseRepositoryTests {
//	@Before("")
//	public void setup(){
//		repository.save(new Course("Microservices in 100 steps"));
//	}
//
//
//	private Logger logger= LoggerFactory.getLogger(this.getClass());
//
//	@Autowired
//	CourseRepository repository;
//
//	@Test
//	void findById_basic() {
//
//		Course course=repository.findById(10001L);
//		assertEquals("JPA in 50 Steppes",course.getName());
//	}
//
//	@Test
//	@DirtiesContext
//	void deleteById_basic() {
//
//		repository.deleteById(10002L);
//		assertNull(repository.findById(10002L));
//
//	}
//	@Test
//	@DirtiesContext
//	void save_basic() {
//		Course course=repository.findById(10001L);
//		assertEquals("JPA in 50 Steppes",course.getName());
//
//		course.setName("Mastering JPA in 2 weeks!");
//		repository.save(course);
//
//		Course course1=repository.findById(10001L);
//		assertEquals("Mastering JPA in 2 weeks!",course1.getName());
//	}
//

}
