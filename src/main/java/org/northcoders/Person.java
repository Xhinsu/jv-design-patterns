package org.northcoders;


public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;
    private final String phoneNumber;

    private final String email;

    public Person(String firstName, String lastName, int age, String address, String phoneNumber, String email) {

        if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("First and last name cannot be null or empty");
        }
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be a positive integer");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
