package ro.scoalainformala.java.model;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String name;
    private int frequencyPerWeek;
    private List <Adress> adressList = new ArrayList<>();

    public Hobby(String name, int frequencyPerWeek, List<Adress> adressList) {
        this.name = name;
        this.frequencyPerWeek = frequencyPerWeek;
        this.adressList = adressList;
    }

    public String getName() {
        return name;
    }

    public List<Adress> getAdressList() {
        return adressList;
    }

    public void addAddress(Adress address) {
        this.adressList.add(address);
    }

}
