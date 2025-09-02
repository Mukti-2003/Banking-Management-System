import java.util.Scanner;

public class BankingOperations {
    public void displayMenu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Banking Management System ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Creating account...");
                    break;
                case 2:
                    System.out.println("Depositing money...");
                    break;
                case 3:
                    System.out.println("Withdrawing money...");
                    break;
                case 4:
                    System.out.println("Viewing balance...");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
        sc.close();
    }
}
