package com.jpa.hibernate.entity;

import lombok.*;
import org.hibernate.search.annotations.*;

import javax.persistence.Entity;
import javax.persistence.FieldResult;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Indexed
@Data
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue
    private Long id;

    @Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
    private String name;

}
