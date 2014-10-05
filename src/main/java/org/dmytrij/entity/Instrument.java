package org.dmytrij.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by Дмитрий on 04.10.14.
 */
@Entity
@Table(name = "INSTRUMENT")
public class Instrument {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "TYPE")
    private String type;
    @Column(name = "PRODUCER")
    private String producer;
    @Column(name = "PROD_DATE")
    private Date prodDate;
    @Column(name = "PURCH_DATE")
    private Date purchDate;
    @OneToMany(mappedBy = "instrument")
    @Fetch(FetchMode.JOIN)
    private Set<Student> students;

    public Set<Student> getStudents() {
        return students;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Date getProdDate() {
        return prodDate;
    }

    public void setProdDate(Date prodDate) {
        this.prodDate = prodDate;
    }

    public Date getPurchDate() {
        return purchDate;
    }

    public void setPurchDate(Date purchDate) {
        this.purchDate = purchDate;
    }
}
