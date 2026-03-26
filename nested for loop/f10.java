import java.util.Scanner;
public class f10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int products = sc.nextInt();
        int vendors = sc.nextInt();

        String[] names = new String[products];
        double[][] prices = new double[products][vendors];

        for (int i = 0; i < products; i++) {
            names[i] = sc.next();
            for (int j = 0; j < vendors; j++) {
                prices[i][j] = sc.nextDouble();
            }
        }

        System.out.println("Price Comparison Matrix:");
        System.out.print("Product ");
        for (int j = 1; j <= vendors; j++) {
            System.out.print("Vendor" + j + " ");
        }
        System.out.println("BestPrice");

        for (int i = 0; i < products; i++) {
            System.out.print(names[i] + " ");
            double min = prices[i][0];

            for (int j = 0; j < vendors; j++) {
                System.out.printf("%.2f ", prices[i][j]);
                if (prices[i][j] < min) {
                    min = prices[i][j];
                }
            }

            System.out.printf("%.2f", min);
            System.out.println();
        }
    }

}
