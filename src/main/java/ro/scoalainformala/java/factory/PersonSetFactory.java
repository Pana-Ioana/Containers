package ro.scoalainformala.java.factory;

import ro.scoalainformala.java.model.Person;
import ro.scoalainformala.java.comparators.AgeComparator;
import ro.scoalainformala.java.comparators.NameComparator;

import java.util.TreeSet;

public class PersonSetFactory {
    private static final NameComparator nameComparator = new NameComparator();
    private static final AgeComparator ageComparator = new AgeComparator();

    public static TreeSet<Person> createSortedByNameSet() {
        return new TreeSet<>(nameComparator);
    }

    public static TreeSet<Person> createSortedByAgeSet() {
        return new TreeSet<>(ageComparator);
    }
}
