package org.genspark;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("New York City")
    private String city;
    @Value("New York")
    private String state;
    @Value("USA")
    private String country;
    @Value("12365")
    private String zipcode;

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getZipcode() {
        return zipcode;
    }

}
