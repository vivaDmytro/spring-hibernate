package org.dmytrij.entity;

/**
 * Created by Дмитрий on 04.10.14.
 */
public class Composition {

    private long id;
    private String title;
    private String author;

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