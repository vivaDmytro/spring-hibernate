package org.dmytrij.dao;

import org.dmytrij.entity.Student;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by Дмитрий on 04.10.2014.
 */
@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Student> getStudents() {

        return sessionFactory.getCurrentSession().createQuery("from Student").list();
    }

    @Override
    public void saveOrUpdate(Student student) {

        sessionFactory.getCurrentSession().saveOrUpdate(student);
    }

    @Override
    public void remove(Student student) {

        sessionFactory.getCurrentSession().delete(student);
    }

    @Override
    public List<Student> getByInstrumentType(String type) {

       Query query = sessionFactory.getCurrentSession()
                 .createQuery("from Student as s inner join s.instrument as i where i.type=:type");
    }
}
