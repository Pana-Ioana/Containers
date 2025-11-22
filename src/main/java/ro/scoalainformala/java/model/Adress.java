package ro.scoalainformala.java.model;

public class Adress {
    private String street;
    private String city;
    private Country country;

    public Adress(String street, String city, Country country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }
}
