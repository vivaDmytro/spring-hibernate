package org.dmytrij.entity;

import javax.persistence.*;

/**
 * Created by Дмитрий on 04.10.14.
 */
@Entity
@Table(name = "COMPOSITION")
public class Composition {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "AUTHOR")
    private String author;
    @ManyToOne(targetEntity = Performance.class)
    private Performance performance;

    public Performance getPerformance() {
        return performance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
