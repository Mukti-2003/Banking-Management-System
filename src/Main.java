public class Main {
    public static void main(String[] args) {
        System.out.println("Starting Banking Management System...");
        DatabaseConnection db = new DatabaseConnection();
        db.connect();

        BankingOperations operations = new BankingOperations();
        operations.displayMenu();

        db.disconnect();
    }
}
