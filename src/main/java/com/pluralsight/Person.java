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

        if (last != 0) {
            return last;
        }
        int first = this.firstName.compareTo(person.firstName);

        if (first != 0) {
            return first;
        }
        return Integer.compare(this.age, person.age);

    }

    @Override
    public String toString() {
        return "first Name: " + firstName + ", last Name: " + lastName + ", age: " + age;
    }
}
