import java.util.Scanner;

public class Currency_Converter {
    public static void main(String[] args) {
        System.out.println("1. Dollar_to_Taka");
        System.out.println("2. Taka_to_Dollar");
        System.out.println("3. Euro_to_Taka");
        System.out.println("4. Taka_to_Euro");
        System.out.println("5. Dollar_to_Euro");
        System.out.println("6. Euro_to_Dollar");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Choose your currency: ");

            int choice = sc.nextInt();
            System.out.print("Enter amount: ");
            double amount = sc.nextDouble();

            switch (choice) {
                case 1:
                    Dollar_to_Taka(amount);
                    break;
                case 2:
                    Taka_to_Dollar(amount);
                    break;
                case 3:
                    Euro_to_Taka(amount);
                    break;
                case 4:
                    Taka_to_Euro(amount);
                    break;
                case 5:
                    Dollar_to_Euro(amount);
                    break;
                case 6:
                    Euro_to_Dollar(amount);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void Dollar_to_Taka(double amount) {
        System.out.println();
        System.out.println("1 Dollar = " + 106.46 + " Taka");
        System.out.println();
        System.out.println(amount + " Dollar = " + (amount * 106.46) + " Taka");
        System.out.println();
    }

    private static void Taka_to_Dollar(double amount) {
        System.out.println();
        System.out.println("1 Taka = " + 0.0094 + " Dollar");
        System.out.println();
        System.out.println(amount + " Taka = " + (amount * 0.0094) + " Dollar");
        System.out.println();
    }

    private static void Euro_to_Taka(double amount) {
        System.out.println();
        System.out.println("1 Euro = " + 113.57 + " Taka");
        System.out.println();
        System.out.println(amount + " Euro = " + (amount * 113.57) + " Taka");
        System.out.println();
    }

    private static void Taka_to_Euro(double amount) {
        System.out.println();
        System.out.println("1 Taka = " + 0.0088 + " Euro");
        System.out.println();
        System.out.println(amount + " Taka = " + (amount * 0.0088) + " Euro");
        System.out.println();
    }

    private static void Dollar_to_Euro(double amount) {
        System.out.println();
        System.out.println("1 Dollar= " + 0.94 + " Euro");
        System.out.println();
        System.out.println(amount + " Dollar = " + (amount * 0.94) + " Euro");
        System.out.println();
    }

    private static void Euro_to_Dollar(double amount) {
        System.out.println();
        System.out.println("1 Euro = " + 1.07 + " Dollar");
        System.out.println();
        System.out.println(amount + " Euro = " + (amount * 1.07) + " Dollar");
        System.out.println();
    }
}
