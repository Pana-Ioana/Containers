package ro.scoalainformala.java.comparators;

import ro.scoalainformala.java.model.Person;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

    AgeComparator ageComparator = new AgeComparator();
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getName().compareTo(p2.getName()), 0);
    }
}
