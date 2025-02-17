import br.com.alura.exercises.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("John");
        person1.setAge(38);

        Person person2 = new Person();
        person2.setName("Jane");
        person2.setAge(22);

        Person person3 = new Person();
        person3.setName("Joseph");
        person3.setAge(59);

        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        System.out.println(people.size());
        System.out.println(people.getFirst().toString());
        System.out.println(people);
    }
}