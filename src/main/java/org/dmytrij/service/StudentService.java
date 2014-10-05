package org.dmytrij.service;

import org.dmytrij.entity.Instrument;
import org.dmytrij.entity.Student;

import java.util.Date;
import java.util.List;

/**
 * Created by Дмитрий on 04.10.14.
 */
public interface StudentService {

    List<Student> getStudents();
    void saveOrUpdate(Student student);
    void remove(Student student);
    void changeInstruments(Student student1, Student student2);
    List<Student> getByInstrumentType(String type);
}
