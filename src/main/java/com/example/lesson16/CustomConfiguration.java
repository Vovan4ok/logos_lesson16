package com.example.lesson16;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomConfiguration {

    @Bean(name = "studentDAO")
    public StudentDAO getStudentDAO() {
        return new StudentDAO();
    }

    @Bean(name = "consoleEventLogger")
    public ConsoleEventLogger getConsoleEventLogger() {
        return new ConsoleEventLogger();
    }
}
