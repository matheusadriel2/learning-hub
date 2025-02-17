package br.com.alura.exercises;

public class Animal {
    private final String name;
    private final int age;
    private final String gender;
    private final String type;

    public Animal(String name, int age, String gender, String type) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", type=" + getType() +
                '}';
    }
}
