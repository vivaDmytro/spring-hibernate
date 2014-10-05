package org.dmytrij.main;

import org.dmytrij.entity.Instrument;
import org.dmytrij.entity.Student;
import org.dmytrij.service.InstrumentService;
import org.dmytrij.service.StudentService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

/**
 * Created by Дмитрий on 04.10.14.
 */
public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentService studentService = context.getBean(StudentService.class);
        List<Student> list = studentService.getStudents();

        List<Student> list1 = studentService.getByInstrumentType("guitar");
        String s= "";
    }
}
