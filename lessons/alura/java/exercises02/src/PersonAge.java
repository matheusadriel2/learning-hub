public class PersonAge {
    private String name;
    private int age;

    public void identityInfo() {
        System.out.printf("""
                Name: %s
                Age: %d
                """, name, age);
    }

    public void verify(int age) {
        if (age >= 18) {
            System.out.println("Legal age.");
        } else {
            System.out.println("BABY!");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
