package ro.scoalainformala.java.program;

import ro.scoalainformala.java.model.*;
import ro.scoalainformala.java.factory.PersonSetFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

        Country country = new Country("Romania");
        Country country1 = new Country("USA");
        Country country2 = new Country("France");

        Adress adress1 = new Adress("Strada 1", "Bucuresti", country);
        Adress adress2 = new Adress("Strada 2", "Cluj", country);
        Adress adress3 = new Adress("Strada 3", "New York", country1);

        Hobby hobby1 = new Hobby("Fotbal", 3, List.of(adress1, adress2));
        Hobby hobby2 = new Hobby("Inot", 2, List.of(adress3));
        Hobby hobby3 = new Hobby("Citit", 7, List.of(adress1, adress3));

        Student student1 = new Student("Andrei", 21, false, 2);
        Hired person1 = new Hired("Maria", 28, true, 5000);
        Unemployed person2 = new Unemployed("George", 35, "IT specialist");

        Map<Person, List< Hobby>> hobbies = new HashMap<>();
        hobbies.put(student1, List.of(hobby1, hobby3));
        hobbies.put(person1, List.of(hobby2));
        hobbies.put(person2, List.of(hobby1, hobby2, hobby3));
        for (Map.Entry<Person, List<Hobby>> entry : hobbies.entrySet()) {
            Person person = entry.getKey();
            List<Hobby> hobbyList = entry.getValue();
            System.out.println("\nHobbies for " + person.getName() + ":");
            for (Hobby hobby : hobbyList) {
                System.out.println("- " + hobby.getName() + " at addresses:");
                for (Adress adress : hobby.getAdressList()) {
                    System.out.println("  * " + adress.getStreet() + ", " + adress.getCity() + ", " + adress.getCountry().getName());
                }
            }
        }

    }
}