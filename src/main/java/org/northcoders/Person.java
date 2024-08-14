package org.northcoders;


public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;
    private final String phoneNumber;

    private final String email;

//    private Person(String firstName, String lastName, int age, String address, String phoneNumber, String email) {
//
//        if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()) {
//            throw new IllegalArgumentException("First and last name cannot be null or empty");
//        }
//        if (age <= 0) {
//            throw new IllegalArgumentException("Age must be a positive integer");
//        }
//
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.address = address;
//        this.phoneNumber = phoneNumber;
//        this.email = email;
//    }



    private Person(PersonBuilder builder) {
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;

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



    public static class PersonBuilder {

        private final String firstName;
        private final String lastName;
        private final int age;
        private String address;
        private String phoneNumber;
        private String email;


        public PersonBuilder(String firstName, String lastName, int age){

            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;

        }

        public PersonBuilder addressMethod(String address){
            this.address = address;
            return this;
        }

        public PersonBuilder phoneNumber(String number){
            this.phoneNumber = number;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Person build () {

            return new Person(this);

        }
    }






}
