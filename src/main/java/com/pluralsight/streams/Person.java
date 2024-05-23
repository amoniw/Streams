package com.pluralsight.streams;

public class Person {
    private String firstName;
    private String lastname;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String firstName, int age, String lastname) {
        this.firstName = firstName;
        this.age = age;
        this.lastname = lastname;


    }
}
