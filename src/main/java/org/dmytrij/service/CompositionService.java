package org.dmytrij.service;

import org.dmytrij.entity.Composition;

import java.util.List;

/**
 * Created by Дмитрий on 04.10.14.
 */
public interface CompositionService {

    List<Composition> getCompositions();
    void saveOrUpdate(Composition composition);
    void remove(Composition composition);
}
