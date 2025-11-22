package ro.scoalainformala.java.model;

public class Hired extends Person{
    private boolean hasJob;
    private double salary;

    public Hired(String name, int age, boolean hasJob, double salary) {
        super(name, age);
        this.hasJob = hasJob;
        this.salary = salary;
    }

}
