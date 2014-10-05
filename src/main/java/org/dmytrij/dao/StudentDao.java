package org.dmytrij.dao;

import org.dmytrij.entity.Student;

import java.util.Date;
import java.util.List;

/**
 * Created by Дмитрий on 04.10.14.
 */
public interface StudentDao {

    List<Student> getStudents();
    void saveOrUpdate(Student student);
    void remove(Student student);
    List<Student> getByInstrumentType(String type);
    List<Student> getByInstrumentDetails(String producer, Date prodDate);
}
