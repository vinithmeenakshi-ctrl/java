package whileloop;
import java.util.Scanner;

public class while20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            int fact = 1;
            int i = 1;

            while (i <= digit) {
                fact = fact * i;
                i++;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println(num + " is a strong number");
        } else {
            System.out.println(num + " is not a strong number");
        }
    }
}

