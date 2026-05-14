package com.pluralsight;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        int last = this.lastName.compareTo(person.lastName);
        return last == 0 ? this.firstName.compareTo(person.firstName) : last;
    }

    @Override
    public String toString() {
        return "first Name: " + firstName + ", last Name: " + lastName + ", age: " + age;
    }
}
