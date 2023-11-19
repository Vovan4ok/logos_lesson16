package com.example.lesson16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext cfx = SpringApplication.run(Application.class, args);
        StudentDAO studentDAO = (StudentDAO) cfx.getBean("studentDAO");
        ConsoleEventLogger logger = (ConsoleEventLogger) cfx.getBean("consoleEventLogger");

        logger.logEvent(studentDAO.create(new Student(1, "Володимир", 19)));
        logger.logEvent(studentDAO.create(new Student(2, "Настя", 19)));
        logger.logEvent(studentDAO.create(new Student(3, "Іван", 19)));
        logger.logEvent(studentDAO.create(new Student(4, "Максим", 19)));
        logger.logEvent(studentDAO.readAll().toString());
        logger.logEvent("==========================================================================");

        logger.logEvent(studentDAO.delete(2));
        logger.logEvent(studentDAO.readAll().toString());
        logger.logEvent("==========================================================================");

        logger.logEvent(studentDAO.update(1, new Student("Володимир", 20)));
        logger.logEvent(studentDAO.readAll().toString());
        logger.logEvent("==========================================================================");
    }

}
