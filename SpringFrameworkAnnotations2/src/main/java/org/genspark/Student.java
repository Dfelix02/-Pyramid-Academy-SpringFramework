package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
    @Value("1")
    private int id;
    @Value("David Felix")
    private String name;
    @Autowired
    private List<Phone> phoneNumber;
    @Autowired
    private Address address;

    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.phoneNumber.get(0).getNumber());
        System.out.println(this.address.getCountry()+", "+this.address.getCity()+", "+this.address.getState()+", "+this.address.getZipcode());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<Phone> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
