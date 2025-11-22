package ro.scoalainformala.java.model;

public class Unemployed extends Person {
   private String lastJobTitle;
    public Unemployed(String name, int age, String lastJobTitle) {
         super(name, age);
            this.lastJobTitle = lastJobTitle;
    }
}
