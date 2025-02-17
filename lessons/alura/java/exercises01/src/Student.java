public class Student {
    String name;
    int age;

    void showPersonInfo() {
        System.out.printf("""
                
                +===+===+===+
                +NEW STUDENT+
                
                Name: %s
                Age: %d
                +===+===+===+
                """, name, age);
    }
}
