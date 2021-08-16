package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Mikey = new Student(
                    "Mikey",
                    "mikeywearing@gmail.com",
                    LocalDate.of(1991, Month.DECEMBER, 27)
            );

            Student Ste = new Student(
                    "Ste",
                    "ste@gmail.com",
                    LocalDate.of(1993, Month.OCTOBER, 29)
            );

            repository.saveAll(
                    List.of(Mikey, Ste)
            );
        };
    }
}
