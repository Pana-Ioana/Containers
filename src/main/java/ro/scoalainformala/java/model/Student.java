package ro.scoalainformala.java.model;

import java.util.List;

public class Student extends Person {
    private boolean hasFinishedCourse;
    private int yearOfStudy;

    public Student(String name, int age, boolean hasFinishedCourse, int yearOfStudy) {
        super(name, age);
        this.hasFinishedCourse = hasFinishedCourse;
        this.yearOfStudy = yearOfStudy;
    }

}
