import java.util.Scanner;

public class f7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int mid = size / 2;

        System.out.println("Diamond Pattern:");

        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

