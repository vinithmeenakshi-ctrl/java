package whileloop;

import java.util.Scanner;

public class while5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int result=0;
       
        int n=sc.nextInt();
        System.out.println("original" +n);

        while(n>0){
            result=n%10;
        }
        n=n/10;
        System.out.println("reversed"+n);


    }
}
