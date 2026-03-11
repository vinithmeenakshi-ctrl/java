package whileloop;

import java.util.Scanner;

public class while2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int count=0;
        System.out.println("enter the number");
        int n=sc.nextInt();
        

        while(n!=0){
            sum=sum+n;
            count++;

            System.out.println("enter the numbr");
            n=sc.nextInt();
        }
        System.out.println("total sum"+sum);
        System.out.println("count"+count);
    
    sc.close();
}
}
