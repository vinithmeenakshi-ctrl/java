package forloop;

import java.util.Scanner;

public class for10{
    public static void main(String[]args){
         Scanner sc = new Scanner (System.in);

        int n  =sc.nextInt();
        double subtotal=0;
        double total_item=0;


        for(int i=0;i<n;i++){
            String itemname=sc.next();
            double price = sc.nextDouble();
            int quantity=sc.nextInt();

           double itemtotal=price*quantity;
           System.out.println("item"+itemname+"price"+price+"x"+quantity+"name"+itemname);

           subtotal+=itemtotal;
           total_item+=quantity;

        }

        double tax=subtotal*0.08;
        double servicecharge= subtotal*0.10;
        double grandtotal=subtotal+tax+servicecharge;


        System.out.println("totalitems"+total_item);
        System.out.println("subtotal"+subtotal);
        System.out.println("tax"+tax);
        System.out.println("service charge"+servicecharge);
        System.out.println("grangtotal"+grandtotal);
        System.out.println();

        sc.close();



    }
}