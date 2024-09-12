package bankApplication;

import java.util.Scanner;

public class bankApplication 
{
    private static double balance = 0.0;

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deposit(scanner);
                    break;
                case 2:
                    withdraw(scanner);
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void deposit(Scanner scanner) 
    {
        System.out.println("Enter amount to deposit:");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    private static void withdraw(Scanner scanner) 
    {
        System.out.println("Enter amount to withdraw:");
        double amount = scanner.nextDouble();
        if (amount > balance) 
        {
            System.out.println("Insufficient balance.");
        } else 
        {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    private static void checkBalance() 
    {
        System.out.println("Current balance: " + balance);
    }
}
