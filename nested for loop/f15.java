import java.util.Scanner;
public class f15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int products = sc.nextInt();
        String[] names = new String[products];
        double[] ratings = new double[products];

        for (int i = 0; i < products; i++) {
            names[i] = sc.next();
            ratings[i] = sc.nextDouble();
        }

        double total = 0;

        System.out.println("Star Rating Matrix:");
        System.out.println("Product Rating Stars");

        for (int i = 0; i < products; i++) {
            System.out.print(names[i] + " " + ratings[i] + " ");
            int full = (int) ratings[i];

            for (int j = 1; j <= 5; j++) {
                if (j <= full) {
                    System.out.print("★");
                } else {
                    System.out.print("☆");
                }
            }
            System.out.println();
            total += ratings[i];
        }

        double avg = total / products;
        System.out.printf("\nAverage Rating: %.2f", avg);
    }

}
