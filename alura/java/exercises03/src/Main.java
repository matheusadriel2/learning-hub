import br.com.exercises03.converter.CoinConverter;
import br.com.exercises03.multiply.MultiplyTable;
import br.com.exercises03.rectangle.RectangleRoomCalculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CoinConverter converter = new CoinConverter();
        System.out.printf("""
                +===+===+===+===+===+===+
                Insert your value in USD: 
                """);
        double dollar = sc.nextDouble();
        System.out.printf("""
                +===+===+===+===+===+===+
                Your cash in BRL is: R$%.2f
                """, converter.convertDollarToReal(dollar));


        RectangleRoomCalculator rc = new RectangleRoomCalculator();
        System.out.printf("""
                +===+===+===+===+===+===+
                Insert the height: 
                """);
        double height = sc.nextDouble();
        System.out.printf("""
                Insert the width: 
                """);
        double width = sc.nextDouble();
        System.out.printf("""
                +===+===+===+===+===+===+
                The area of given numbers is: %.2f
                The perimeter of given numbers is %.2f
                +===+===+===+===+===+===+
                """, rc.calculateArea(height, width), rc.calculatePerimeter(height, width));


        MultiplyTable mult = new MultiplyTable();
        System.out.printf("""
                Insert the table number: 
                """);
        int tableNu = sc.nextInt();
        mult.showTable(tableNu);
    }
}
