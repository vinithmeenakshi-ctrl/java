package whileloop;
import java.util.Scanner;

public class while10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0, b = 1, i = 1;

        System.out.println("Fibonacci sequence (" + n + " terms):");

        while (i <= n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
}

