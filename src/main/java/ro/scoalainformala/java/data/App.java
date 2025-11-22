package ro.scoalainformala.java.data;

import ro.scoalainformala.java.factory.PersonSetFactory;
import ro.scoalainformala.java.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class App {
        public List <Person> initializePeopleList() {
            Person p1 = new Student("Andrei", 21, false, 2);
            Person p2 = new Hired("Maria", 28, true, 5000);
            Person p3 = new Unemployed("George", 35, "IT Specialist");
            Person p4 = new Student("Ioana", 19, true, 1);
            Person p5 = new Hired("Alex", 30, false, 6000);

            return List.of(p1, p2, p3, p4, p5);
        }
        public Map<Person, List<Hobby>> initializeHobbies() {
            Country ro = new Country("Romania");
            Country us = new Country("USA");
            Country fr = new Country("France");

            Adress a1 = new Adress("Flower Street", "Bucharest", ro);
            Adress a2 = new Adress("Maple Avenue", "Cluj", ro);
            Adress a3 = new Adress("Ocean Drive", "Miami", us);
            Adress a4 = new Adress("Champs-Élysées", "Paris", fr);

            Hobby hobby1 = new Hobby("Photography", 3, List.of(a1, a3));
            Hobby hobby2 = new Hobby("Cooking", 5, List.of(a2, a4));
            Hobby hobby3 = new Hobby("Hiking", 2, List.of(a1, a2, a3));

           Person p1 = new Student("Andrei", 21, false, 2);
           Person p2 = new Hired("Maria", 28, true, 5000);
           Person p3 = new Unemployed("George", 35, "IT Specialist");

            Map<Person, List<Hobby>> map = new HashMap<>();
            map.put(p1, List.of(hobby1, hobby3));
            map.put(p2, List.of(hobby2));
            map.put(p3, List.of(hobby1, hobby2, hobby3));

            return map;
        }
}

