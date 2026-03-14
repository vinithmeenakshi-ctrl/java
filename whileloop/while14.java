package whileloop;
import java.util.Scanner;

public class while14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int digits = 0;

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        temp = num;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;
            int i = 0;

            while (i < digits) {
                power = power * digit;
                i++;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }

}
