package whileloop;
import java.util.Scanner;

public class while6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = sc.nextInt();
        int amount = 0;
        boolean success = false;

        System.out.println("Balance: " + balance);

        while (!success) {
            amount = sc.nextInt();
            System.out.println("Enter withdrawal amount: " + amount);

            if (amount <= 0 || amount % 100 != 0) {
                System.out.println("Invalid amount! Try again.");
            }
            else if (amount > balance) {
                System.out.println("Insufficient funds! Try again.");
            }
            else {
                balance = balance - amount;
                System.out.println("Withdrawal successful! Remaining balance: " + balance);
                success = true;
            }
        }
    }
}
