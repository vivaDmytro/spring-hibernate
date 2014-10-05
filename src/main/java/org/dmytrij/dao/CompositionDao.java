package org.dmytrij.dao;

import org.dmytrij.entity.Composition;

import java.util.List;

/**
 * Created by Дмитрий on 04.10.14.
 */
public interface CompositionDao {

    List<Composition> getCompositions();
    void saveOrUpdate(Composition composition);
    void remove(Composition composition);
}
