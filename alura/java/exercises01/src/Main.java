public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.hello();

        Calculator calc1 = new Calculator();
        calc1.calc(10);

        Song song1 = new Song();
        song1.title = "The Animal";
        song1.artist = "Disturbed";
        song1.releaseYear = 2010;
        song1.Datasheet();

        Car car1 = new Car();
        car1.model = "Tesla Model X";
        car1.year = 2024;
        car1.color = "Midnight Black";
        car1.Datasheet();

        Student stud1 = new Student();
        stud1.name = "Bruna";
        stud1.age = 22;
        stud1.showPersonInfo();
    }
}
