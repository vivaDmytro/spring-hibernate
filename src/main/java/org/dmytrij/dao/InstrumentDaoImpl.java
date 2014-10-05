package org.dmytrij.dao;

import org.dmytrij.entity.Instrument;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * Created by Дмитрий on 04.10.2014.
 */
@Repository
public class InstrumentDaoImpl implements InstrumentDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Instrument> getInstruments() {

        return sessionFactory.getCurrentSession().createQuery("from Instrument").list();
    }

    @Override
    public void saveOrUpdate(Instrument instrument) {

        sessionFactory.getCurrentSession().saveOrUpdate(instrument);
    }

    @Override
    public void remove(Instrument instrument) {

        sessionFactory.getCurrentSession().delete(instrument);
    }
}
