package org.dmytrij.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Дмитрий on 04.10.14.
 */
@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @Column
    private long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "BIRTH_DATE")
    private Date birthDate;
    @ManyToOne(targetEntity = Instrument.class)
    private Instrument instrument;

    public Instrument getInstrument() {
        return instrument;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
