package whileloop;
import java.util.Scanner;

public class while19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        int original = decimal;
        int binary = 0;
        int place = 1;

        while (decimal > 0) {
            int rem = decimal % 2;
            binary = binary + rem * place;
            place = place * 10;
            decimal = decimal / 2;
        }

        System.out.println("Decimal: " + original);
        System.out.println("Binary: " + binary);
    }
}

