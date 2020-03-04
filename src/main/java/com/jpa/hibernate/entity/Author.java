package com.jpa.hibernate.entity;

import lombok.*;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Indexed
@Data
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue
    private Integer id;

    @Field
    private String name;

}

