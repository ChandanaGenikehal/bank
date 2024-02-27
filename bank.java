import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        String accountNumber = "";
        double balance = 0;

      
        boolean exit = false;
        while (!exit) {
            System.out.println("\nWelcome to Basic Banking System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    accountNumber = scanner.next();
                    System.out.print("Enter initial balance: $");
                    balance = scanner.nextDouble();
                    System.out.println("Account created successfully.");
                    break;
                case 2:
                    if (accountNumber.isEmpty()) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount < 0) {
                        System.out.println("Invalid deposit amount.");
                    } else {
                        balance += depositAmount;
                        System.out.println("Deposit successful. New balance: $" + balance);
                    }
                    break;
                case 3:
                    if (accountNumber.isEmpty()) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount < 0) {
                        System.out.println("Invalid withdrawal amount.");
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds.");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Withdrawal successful. New balance: $" + balance);
                    }
                    break;
                case 4:
                    if (accountNumber.isEmpty()) {
                        System.out.println("Please create an account first.");
                        break;
                    }
                    System.out.println("Current balance: $" + balance);
                    break;
                case 5:
                    System.out.println("Thank you for using Basic Banking System. Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
}
}

