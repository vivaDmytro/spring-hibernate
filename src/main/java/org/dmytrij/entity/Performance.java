package org.dmytrij.entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Дмитрий on 04.10.14.
 */
@Entity
@Table(name = "PERFORMANCE")
public class Performance {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToMany(mappedBy = "performance")
    @Fetch(FetchMode.JOIN)
    private Set<Composition> compositions;
    @OneToMany(cascade=CascadeType.ALL)
    @JoinTable(name="PERFORMANCE_PARTICIPANTS", joinColumns={
            @JoinColumn(name="STUDENT_ID", referencedColumnName="ID")
    },
            inverseJoinColumns={@JoinColumn(name="PERFORMANCE_ID", referencedColumnName="ID")})
    private Set<Student> students;

    public Set<Student> getStudents() {
        return students;
    }

    public Set<Composition> getCompositions() {
        return compositions;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
