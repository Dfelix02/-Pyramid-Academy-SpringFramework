package org.genspark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public Student getStudent(){
        Student student = new Student();
        List<Phone> phoneNumber = new ArrayList<>();
        phoneNumber.add(getStudentPhone("12365478"));
        student.setAddress(getStudentAddress("New York City","USA","NY","12345"));
        student.setId(1);
        student.setName("David Felix");
        student.setPhoneNumber(phoneNumber);
        return student;
    }
    @Bean
    public Address getStudentAddress(String city,String country, String state, String zipCode){
        Address address = new Address();
        address.setCity(city);
        address.setCountry(country);
        address.setState(state);
        address.setZipcode(zipCode);
        return address;
    }
    @Bean
    public Phone getStudentPhone(String number){
        Phone phone = new Phone();
        phone.setNumber(number);
        return phone;
    }
}
