import java.util.Scanner;

public class problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int usernameMatch = sc.nextInt();   // 1 = Match, 0 = Not Match
        int passwordMatch = sc.nextInt();   // 1 = Match, 0 = Not Match
        int accountLocked = sc.nextInt();   // 1 = Locked, 0 = Not Locked

        if (usernameMatch == 1 && passwordMatch == 1 && !(accountLocked == 1)) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }

        sc.close();
    }
}


