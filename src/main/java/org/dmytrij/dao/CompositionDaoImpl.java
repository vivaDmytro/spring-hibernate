package org.dmytrij.dao;

import org.dmytrij.entity.Composition;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Дмитрий on 04.10.2014.
 */
@Repository
public class CompositionDaoImpl implements CompositionDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Composition> getCompositions() {

        return sessionFactory.getCurrentSession().createQuery("from Composition").list();
    }

    @Override
    public void saveOrUpdate(Composition composition) {

        sessionFactory.getCurrentSession().saveOrUpdate(composition);
    }

    @Override
    public void remove(Composition composition) {

        sessionFactory.getCurrentSession().delete(composition);
    }
}
