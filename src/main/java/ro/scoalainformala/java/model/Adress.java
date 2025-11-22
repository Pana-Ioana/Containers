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

    @Override
    public String toString() {
        return street + ", " + city + ", " + country.getName();
    }

    public Country getCountry() {
        return country;
    }
}
