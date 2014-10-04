package org.dmytrij.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Дмитрий on 04.10.14.
 */
@Entity
@Table(name = "PERFORMANCE")
public class Performance {

    @Id
    @Column
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
