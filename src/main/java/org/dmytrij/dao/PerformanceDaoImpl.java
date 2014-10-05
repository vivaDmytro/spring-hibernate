package org.dmytrij.dao;

import org.dmytrij.entity.Composition;
import org.dmytrij.entity.Performance;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Дмитрий on 04.10.2014.
 */
@Repository
public class PerformanceDaoImpl implements PerformanceDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Performance> getPerformances() {

        return sessionFactory.getCurrentSession().createQuery("from Performance").list();
    }

    @Override
    public void saveOrUpdate(Performance performance) {

        sessionFactory.getCurrentSession().saveOrUpdate(performance);
    }


}
