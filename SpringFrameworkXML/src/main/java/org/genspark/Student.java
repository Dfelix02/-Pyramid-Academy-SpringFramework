package org.genspark;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Phone> phoneNumber;
    private Address address;

    public Student() {
    }

    public Student(int id, String name, List<Phone> phoneNumber, Address address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.phoneNumber.get(0).getNumber());
        System.out.println(this.address.getCountry()+", "+this.address.getCity()+", "+this.address.getState()+", "+this.address.getZipcode());
    }


}
