package com.jpa.hibernate.entity;

import lombok.*;
import org.hibernate.search.annotations.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Indexed
@Data
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue
    private Integer id;

    @Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
    private String title;

    @Field(index=Index.YES, analyze=Analyze.YES, store=Store.NO)
    private String subtitle;

    @Field(index=Index.YES, analyze= Analyze.NO, store= Store.YES)
    @DateBridge(resolution= Resolution.DAY)
    private Date publicationDate;

    @IndexedEmbedded
    @ManyToMany
    private Set<Author> authors = new HashSet<Author>();

}
