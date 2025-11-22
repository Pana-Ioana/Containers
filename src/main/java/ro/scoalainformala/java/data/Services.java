package ro.scoalainformala.java.data;

import ro.scoalainformala.java.factory.PersonSetFactory;
import ro.scoalainformala.java.model.*;

import java.util.*;

public class Services {
    public void run(App init) {

        List<Person> persons = init.initializePeopleList();
        Map<Person, List<Hobby>> hobbies = init.initializeHobbies();

        TreeSet<Person> byName = PersonSetFactory.createSortedByNameSet();
        TreeSet<Person> byAge  = PersonSetFactory.createSortedByAgeSet();

        for (Person p : persons) {
            byName.add(p);
            byAge.add(p);
        }

        System.out.println("Sorted by name:");
        printTreeSet(byName);

        System.out.println("\nSorted by age:");
        printTreeSet(byAge);

        Person selected = persons.get(0);

        System.out.println("\nHobbies and countries for " + selected.getName() + ":");
        printHobbiesForPerson(hobbies, selected);
    }

    private void printTreeSet(Set<Person> set) {
        for (Person p : set) {
            System.out.println(p.getName() + " - " + p.getAge());
        }
    }

    private void printHobbiesForPerson(Map<Person, List<Hobby>> map, Person person) {
        List<Hobby> hobbies = map.get(person);
        if (hobbies == null || hobbies.isEmpty()) {
            System.out.println("No hobbies found.");
            return;
        }

        for (Hobby h : hobbies) {
            System.out.println("- " + h.getName());
            Set<String> countries = new HashSet<>();
            for (Adress a : h.getAdressList()) {
                countries.add(a.getCountry().getName());
            }
            System.out.println("    Countries: " + String.join(", ", countries));
        }
    }
}
