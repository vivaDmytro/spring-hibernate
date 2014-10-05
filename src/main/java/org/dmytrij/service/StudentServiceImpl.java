package org.dmytrij.service;

import org.dmytrij.dao.StudentDao;
import org.dmytrij.entity.Instrument;
import org.dmytrij.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by Дмитрий on 05.10.2014.
 */
@Repository
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    @Transactional
    public List<Student> getStudents() {

        return studentDao.getStudents();
    }

    @Override
    @Transactional
    public void saveOrUpdate(Student student) {

        studentDao.saveOrUpdate(student);
    }

    @Override
    @Transactional
    public void remove(Student student) {

        studentDao.remove(student);
    }

    @Override
    @Transactional
    public void changeInstruments(Student student1, Student student2) {

        Instrument instrument1 = student1.getInstrument();
        Instrument instrument2 = student2.getInstrument();

        student1.setInstrument(instrument2);
        studentDao.saveOrUpdate(student1);

        student2.setInstrument(instrument1);
        studentDao.saveOrUpdate(student2);
    }

    @Override
    @Transactional
    public List<Student> getByInstrumentType(String type) {

        return studentDao.getByInstrumentType(type);
    }

    @Override
    @Transactional
    public List<Student> getByInstrumentDetails(String producer, Date prodDate) {

        return studentDao.getByInstrumentDetails(producer, prodDate);
    }
}
