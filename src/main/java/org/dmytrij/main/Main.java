package org.dmytrij.main;

import org.dmytrij.entity.Composition;
import org.dmytrij.entity.Instrument;
import org.dmytrij.entity.Performance;
import org.dmytrij.entity.Student;
import org.dmytrij.service.CompositionService;
import org.dmytrij.service.InstrumentService;
import org.dmytrij.service.PerformanceService;
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

        PerformanceService performanceService = context.getBean(PerformanceService.class);
        CompositionService compositionService = context.getBean(CompositionService.class);
        StudentService studentService = context.getBean(StudentService.class);

        List<Performance> list = performanceService.getPerformances();
        List<Composition> compositions = compositionService.getCompositions();
        List<Student> students = studentService.getStudents();

        Performance performance = list.get(2);

        performanceService.showDetails(performance);

        Composition composition = compositions.get(0);

        performanceService.setComposition(performance, composition);

        Student student = students.get(1);
        performanceService.addStudentToPerformance(performance, student);

        String s = "";
    }
}
