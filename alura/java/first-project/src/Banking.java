import java.util.Scanner;
public class Banking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Matheus Adriel";
        String type = "Current";
        double balance = 2500.00;
        int option;

        System.out.printf("""
                ****************************************
                Client data:
                
                Name:              %s
                Account type:      %s
                Current balance:   $%.2f
                ****************************************
                """, name, type, balance);

        do {
            System.out.printf("""
                    Operations
                    
                    1. Show balance
                    2. Receive value
                    3. Transfer value
                    4. Exit                   
                        
                    Choose an option:
                    """);

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.printf("Your balance is: %.2f\n", balance);
                    break;
                case 2:
                    System.out.println("Insert the value:");
                    double receiveV = scanner.nextDouble();
                    balance += receiveV;
                    System.out.printf("Balance: $%.2f\n", balance);
                    break;
                case 3:
                    System.out.println("Insert the value you want to transfer:");
                    double transferV = scanner.nextDouble();
                    if (transferV < balance) {
                        balance -= transferV;
                    } else {
                        System.out.println("Insuficient funds.");
                    }
                    System.out.printf("Balance: $%.2f\n", balance);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (option != 4);
    }
}
