import java.util.Scanner;
public class f5{
 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int daysInMonth = sc.nextInt();
        int startDay = sc.nextInt();  

        System.out.println("Calendar Grid:");
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        int date = 1;
        for (int i = 1; i <= 7; i++) {
            if (i < startDay) {
                System.out.print("");
            } else {
                System.out.print(date + " ");
                date++;
            }
        }
        System.out.println();
        while (date <= daysInMonth) {
            for (int i = 1; i <= 7 && date <= daysInMonth; i++) {
                System.out.print(date + " ");
                date++;
            }
            System.out.println();
        }

        sc.close();
    }
}