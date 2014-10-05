package org.dmytrij.service;

import org.dmytrij.dao.PerformanceDao;
import org.dmytrij.entity.Composition;
import org.dmytrij.entity.Performance;
import org.dmytrij.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

/**
 * Created by Дмитрий on 05.10.14.
 */
@Service
public class PerformanceServiceImpl implements PerformanceService {

    @Autowired
    private PerformanceDao performanceDao;

    @Override
    @Transactional
    public List<Performance> getPerformances() {

        return performanceDao.getPerformances();
    }

    @Override
    @Transactional
    public void setComposition(Performance performance, Composition composition) {

        performance.setComposition(composition);
        performanceDao.saveOrUpdate(performance);
    }

    @Override
    @Transactional
    public void addStudentToPerformance(Performance performance, Student student) {

        performance.getStudents().add(student);
        performanceDao.saveOrUpdate(performance);
    }

    @Override
    public void showDetails(Performance performance) {

        System.out.println(performance.toString());
    }

    @Override
    public void showDetails(Collection<Performance> performances) {

        for (Performance performance : performances) {

            System.out.println(performance.toString());
        }
    }
}
