package org.dmytrij.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Дмитрий on 04.10.14.
 */
public class Main {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
