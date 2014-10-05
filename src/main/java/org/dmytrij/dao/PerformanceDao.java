package org.dmytrij.dao;

import org.dmytrij.entity.Composition;
import org.dmytrij.entity.Performance;

import java.util.List;

/**
 * Created by Дмитрий on 04.10.14.
 */
public interface PerformanceDao {

    List<Performance> getPerformances();
    void saveOrUpdate(Performance performance);
}
