package com.qa.main;

public class Person {

    String name;
    int age;
    String jobTtitle;

    public Person (String name, int age, String jobTitle) {
        this.name = name;
        this.age = age;
        this.jobTtitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jobTtitle='" + jobTtitle + '\'' +
                '}';
    }
}
