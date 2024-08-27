public class Car {
    String model;
    int year;
    String color;

    void Datasheet() {
        System.out.printf("""
                
                +===+===+===+
                Model: %s
                Year: %d
                Color: %s
                +===+===+===+
                """, model, year, color);
    }
}
