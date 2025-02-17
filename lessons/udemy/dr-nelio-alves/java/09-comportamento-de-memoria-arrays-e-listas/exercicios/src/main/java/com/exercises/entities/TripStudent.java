package main.java.com.exercises.entities;

public class TripStudent {
    private int room;
    private String name;
    private String email;

    public TripStudent() {
    }

    public TripStudent(int room, String name, String email) {
        this.room = room;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getRoom() {
        return room;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return room + ": " + name + ", " + email + "\n";
    }
}
