package org.genspark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public Student getStudent(){return new Student();
    }
    @Bean
    public Address getStudentAddress(){
        return new Address();
    }
    @Bean
    public Phone getStudentPhone(){
        return new Phone();
    }
}
