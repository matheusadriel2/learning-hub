package main.java.exercises;

public class Address {
    private String street;
    private int number;
    private Cep cep;
    private City city;

    public Address() {
    }

    public Address(String street, int number, Cep cep, City city) {
        this.street = street;
        this.number = number;
        this.cep = cep;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return street + number + cep + city;
    }
}
