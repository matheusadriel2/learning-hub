class Main {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office Desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.60;
        double measure = 53.234567;

        System.out.printf("""
                Products:
                %s, which price is $ %.2f
                %s, which price is $ %.2f
                
                Record: %d years old, code %s and gender: %c
                
                Measure with eight decimal places: %.8f
                Rounded (three decimal places): %.3f
                """, product1, price1, product2, price2, age, code, gender, measure, measure, measure );

        double x = Math.sqrt(25);
        System.out.println(x);
    }
}