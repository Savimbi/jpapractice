package com.jpa.hibernate.repository;

import com.jpa.hibernate.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Repository
@Transactional
public class CourseRepository {

    @Autowired
    EntityManager em;


    public Course findById(Long id){
        return em.find(Course.class,id);
    }

    public void deleteById(Long id){
        Course course = findById(id);
        em.remove(course);
    }

    public Course save(Course course){
        if(course.getId()==null){
            em.persist(course);
        }else {
            em.merge(course);
        }

        return course;
    }
}
