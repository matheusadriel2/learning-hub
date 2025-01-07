import br.com.alura.exercises.Perishable;
import br.com.alura.exercises.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Product product1 = new Product();
//        product1.setName("Milk");
//        product1.setPrice(4.00);
//        product1.setQuantity(1);
//
//        Product product2 = new Product();
//        product2.setName("Bread");
//        product2.setPrice(10.00);
//        product2.setQuantity(10);
//
//        Product product3 = new Product();
//        product3.setName("Cheese");
//        product3.setPrice(85.00);
//        product3.setQuantity(1);
//
//        ArrayList<Product> products = new ArrayList<>();
//        products.add(product1);
//        products.add(product2);
//        products.add(product3);

//        System.out.println(products.getFirst().toString());

//        === Constructor ===

        Product product4 = new Product("Cola", 15.00, 1);
        System.out.println(product4);

        Perishable perish = new Perishable("Apple", 2.0, 1, 1005);
        System.out.println(perish);
    }
}