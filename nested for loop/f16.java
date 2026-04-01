import java.util.Scanner;

public class f16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        boolean[][] lot = new boolean[rows][cols];

        int occupied = sc.nextInt();

        for (int i = 0; i < occupied; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            lot[r][c] = true;
        }

        System.out.println("Parking Lot Grid:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (lot[i][j]) {
                    System.out.print("[O] ");
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }

        int total = rows * cols;
        int vacant = total - occupied;
        double rate = (occupied * 100.0) / total;

        System.out.println();
        System.out.println("Total Spots: " + total);
        System.out.println("Occupied: " + occupied);
        System.out.println("Vacant: " + vacant);
        System.out.printf("Occupancy Rate: %.2f%%", rate);
    }

}
