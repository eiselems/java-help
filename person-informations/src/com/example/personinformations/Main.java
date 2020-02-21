package com.example.personinformations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter how many person you want to enter:");
        int numberOfPeople = in.nextInt();

        List<Person> allPersons = new ArrayList<>();

        for (int i = 0; i < numberOfPeople; i++) {

            System.out.println("-----------------------------");
            System.out.println("Please enter person number " + (i + 1));

            System.out.println("Enter name:");
            String name = in.next();

            System.out.println("Enter address:");
            String address = in.next();

            System.out.println("Enter age:");
            int age = in.nextInt();

            Person person = new Person(name, address, age);
            allPersons.add(person);
        }

        System.out.println("-----------------------------");

        for (Person person : allPersons) {
            System.out.println(person);
        }


    }

    public static class Person {

        private final String name;
        private final String address;
        private final int age;

        public Person(String name, String address, int age) {
            this.name = name;
            this.address = address;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ") " + address;
        }
    }
}
