import java.util.Scanner;

public class f8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();
        int days = sc.nextInt();

        String[] names = new String[students];
        char[][] attendance = new char[students][days];

        for (int i = 0; i < students; i++) {
            names[i] = sc.next();
            for (int j = 0; j < days; j++) {
                attendance[i][j] = sc.next().charAt(0);
            }
        }

        int perfectCount = 0;

        System.out.println("Attendance Matrix:");

        System.out.print("Student ");
        for (int i = 1; i <= days; i++) {
            System.out.print("Day" + i + " ");
        }
        System.out.println("Attendance%");

        for (int i = 0; i < students; i++) {
            int present = 0;

            System.out.print(names[i] + " ");

            for (int j = 0; j < days; j++) {
                System.out.print(attendance[i][j] + " ");
                if (attendance[i][j] == 'P') {
                    present++;
                }
            }

            double percent = (present * 100.0) / days;
            System.out.printf("%.2f%%\n", percent);

            if (percent == 100.0) {
                perfectCount++;
            }
        }

        System.out.println();
        System.out.println("Perfect Attendance: " + perfectCount + " students");
    }
}

