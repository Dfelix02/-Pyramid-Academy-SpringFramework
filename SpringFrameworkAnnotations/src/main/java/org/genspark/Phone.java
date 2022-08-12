package org.genspark;

import org.springframework.stereotype.Component;

@Component
public class Phone {
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
