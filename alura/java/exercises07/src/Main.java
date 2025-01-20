import br.com.alura.exercises.Animal;
import br.com.alura.exercises.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bob", 5, "Male", "Canine");

        if (dog1 instanceof Animal) {
            Animal animal1 = (Animal) dog1;

            System.out.println("The object was converted into Animal: ");
            System.out.println(animal1.toString());
        } else {
            System.out.println("dog1 is not an instance of Animal.");
        }
    }
}
