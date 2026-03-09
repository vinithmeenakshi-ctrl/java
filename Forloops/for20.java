package forloop;
import java.util.Scanner;

public class for20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double totalDeposits = 0;
        double totalWithdrawals = 0;
        double totalTransfers = 0;
        double totalPayments = 0;

        for (int i = 1; i <= N; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();

            System.out.println("Transaction " + i + ": " + type);
            System.out.println("Amount: $" + amount);

            if (type.equalsIgnoreCase("Deposit")) {
                System.out.println("Category: Credit");
                totalDeposits += amount;
            } else if (type.equalsIgnoreCase("Withdrawal")) {
                System.out.println("Category: Debit");
                totalWithdrawals += amount;
            } else if (type.equalsIgnoreCase("Transfer")) {
                System.out.println("Category: Debit");
                totalTransfers += amount;
            } else if (type.equalsIgnoreCase("Payment")) {
                System.out.println("Category: Debit");
                totalPayments += amount;
            }

            System.out.println();
        }

        double netBalance = totalDeposits - (totalWithdrawals + totalTransfers + totalPayments);

        System.out.println("Total Transactions: " + N);
        System.out.println("Total Deposits: $" + totalDeposits);
        System.out.println("Total Withdrawals: $" + totalWithdrawals);
        System.out.println("Total Transfers: $" + totalTransfers);
        System.out.println("Total Payments: $" + totalPayments);
        System.out.println("Net Balance Change: $" + netBalance);

        sc.close();
    }

}
