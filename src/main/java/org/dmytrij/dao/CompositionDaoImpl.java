package org.dmytrij.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Дмитрий on 04.10.2014.
 */
@Repository
public class CompositionDaoImpl implements CompositionDao {

    @Autowired
    private SessionFactory sessionFactory;

}
