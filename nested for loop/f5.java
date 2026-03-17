 import java.util.Scanner;
public class f5 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int daysInMonth = sc.nextInt();
        int startDay = sc.nextInt();

        System.out.println("Calendar Grid:");
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        int date = 1;
        int totalCells = daysInMonth + startDay - 1;

        for (int i = 1; i <= totalCells; i++) {
            for (int j = i; j <= i; j++) {
                if (i < startDay) {
                    System.out.print(" ");
                } else {
                    System.out.print(date + " ");
                    date++;
                }
            }
            if (i % 7 == 0) {
                System.out.println();
            }
        }
    }

}
