package org.dmytrij.service;

import org.dmytrij.entity.Composition;
import org.dmytrij.entity.Performance;
import org.dmytrij.entity.Student;

import java.util.Collection;
import java.util.List;

/**
 * Created by Дмитрий on 04.10.14.
 */
public interface PerformanceService {

    List<Performance> getPerformances();
    void setComposition(Performance performance, Composition composition);
    void addStudentToPerformance(Performance performance, Student student);
    void showDetails(Performance performance);
    void showDetails(Collection<Performance> performances);
}
