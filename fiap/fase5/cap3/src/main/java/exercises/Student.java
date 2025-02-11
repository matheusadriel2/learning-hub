package main.java.exercises;

public class Student {
    private String name;
    private Address address;
    private int registration;

    public Student() {
    }

    public Student(String name, Address address, int registration) {
        this.name = name;
        this.address = address;
        this.registration = registration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Estudante:\n");
        sb.append("Nome: " + name + "\n");
        sb.append("Rua: " + address.getStreet() + " n." + address.getNumber() + "\n");
        sb.append("CEP: " + address.getCep().toString() + "\n");
        sb.append("Cidade: " + address.getCity().getCity() + ", estado: " + address.getCity().getState() + "\n");
        sb.append("Código de registro: " + registration);
        return sb.toString();
    }
}
