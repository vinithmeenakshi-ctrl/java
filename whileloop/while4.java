package whileloop;

import java.util.Scanner;

public class while4 {
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
       

        int n=sc.nextInt();
        int result=1;
        int counter =1;
        while(counter<=n){
            result=result*counter;
            counter++;
        }
        System.out.println("factorial"+result);
    }
}
