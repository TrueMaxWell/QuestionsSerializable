package com.company.Serialization;

import java.io.Serializable;

public class Human implements Serializable {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human :\nname = " + name + "\nage = " + age + "\n";
    }
}
