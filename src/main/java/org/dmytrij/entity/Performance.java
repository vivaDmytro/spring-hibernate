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
    private long id;
    @OneToMany(mappedBy = "performance")
    @Fetch(FetchMode.JOIN)
    private Set<Composition> compositions;

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
