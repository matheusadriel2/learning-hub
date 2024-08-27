public class Product {
    private String name;
    private int price;

    public int discount(int percentage) {
        int discountAmount = (percentage * price) / 100;
        price -= discountAmount;
        return price;
    }

    public void showProductInfo() {
        System.out.printf("""
                Product: %s
                Price: %d
                """, name, price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
