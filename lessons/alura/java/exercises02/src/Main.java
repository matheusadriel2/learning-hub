public class Main {
    public static void main(String[] args) {
        PersonAge person1 = new PersonAge();
        person1.setName("Matheus");
        person1.setAge(24);

        person1.identityInfo();

        Product product1 = new Product();
        product1.setName("DeathAdder v2");
        product1.setPrice(500);
        product1.discount(20);
        product1.showProductInfo();

    }
}
