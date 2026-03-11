package whileloop;

import java.util.Scanner;

public class while3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();
        int guess=0;
        int attempts=0;

        while(guess !=n){
            guess=sc.nextInt();
            attempts++;
            System.out.println("guess the number"+guess);

            if(guess>n){
                System.out.println("too high");
            }
            else if(guess<n){
                System.out.println("too low");
            }
            else{
                System.out.println("correct attempts"+attempts);
            }
        }
        sc.close();
    
    }
}
