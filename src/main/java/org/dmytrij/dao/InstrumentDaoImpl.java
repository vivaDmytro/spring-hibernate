package org.dmytrij.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Дмитрий on 04.10.2014.
 */
public class InstrumentDaoImpl implements InstrumentDao {

    @Autowired
    private SessionFactory sessionFactory;
}
