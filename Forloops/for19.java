package forloop;
import java.util.Scanner;

public class for19 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int active = 0, expiringSoon = 0, expired = 0;

        for (int i = 0; i < n; i++) {
            String productID = sc.next();
            String productType = sc.next();
            int monthsUsed = sc.nextInt();
            int warrantyPeriod = 0;

            if (productType.equals("Electronics")) {
                warrantyPeriod = 12;
            } else if (productType.equals("Appliance")) {
                warrantyPeriod = 24;
            } else if (productType.equals("Computer")) {
                warrantyPeriod = 36;
            }

            int remaining = warrantyPeriod - monthsUsed;
            if (remaining < 0) remaining = 0;

            String status;
            if (remaining == 0) {
                status = "Expired";
                expired++;
            } else if (remaining >= 1 && remaining <= 3) {
                status = "Expiring Soon";
                expiringSoon++;
            } else {
                status = "Active";
                active++;
            }

            System.out.println("Product ID: " + productID);
            System.out.println("Type: " + productType);
            System.out.println("Warranty Period: " + warrantyPeriod + " months");
            System.out.println("Months Used: " + monthsUsed);
            System.out.println("Remaining: " + remaining + " months");
            System.out.println("Status: " + status);
            System.out.println();
        }

        System.out.println("Total Products: " + n);
        System.out.println("Active Warranties: " + active);
        System.out.println("Expiring Soon: " + expiringSoon);
        System.out.println("Expired Warranties: " + expired);
    }
}

