package ro.scoalainformala.java.program;

import ro.scoalainformala.java.model.Person;
import ro.scoalainformala.java.factory.PersonSetFactory;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Person> personsByName = PersonSetFactory.createSortedByNameSet();
        TreeSet<Person> personsByAge = PersonSetFactory.createSortedByAgeSet();

        Person p1 = new Person("Ana", 25);
        Person p2 = new Person("Mihai", 30);
        Person p3 = new Person("Ioana", 22);
        Person p4 = new Person("Ana", 20);

        personsByName.add(p1);
        personsByName.add(p2);
        personsByName.add(p3);
        personsByName.add(p4);

        personsByAge.add(p1);
        personsByAge.add(p2);
        personsByAge.add(p3);
        personsByAge.add(p4);

        System.out.println("Persoane ordonate dupa nume:");
        for (Person p : personsByName) {
            System.out.println(p.getName() + " - " + p.getAge());
        }

        System.out.println("\nPersoane ordonate dupa varsta:");
        for (Person p : personsByAge) {
            System.out.println(p.getName() + " - " + p.getAge());
        }
    }
}