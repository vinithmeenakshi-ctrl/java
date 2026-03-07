package forloop;

import java.util.Scanner;

public class for8 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        int n= sc.nextInt();
        int totalitems =0;
        double originaltotal=0;
        double finaltotal=0;
        
        for(int i=0;i<n;i++){
            String productname=sc.next();
            double price = sc.nextDouble();
            int quantity = sc.nextInt();

           int discount=0;

           if(quantity==1){
            discount=0;
           }
           else if(quantity>=2 && quantity<=4){
            discount=10;
           }
           else if(quantity>=5 && quantity<=9){
            discount=15;
           }
           else{
            quantity=20;
           }
           double original=price *quantity;
           double subtotal=original*(i-discount/100);

           System.out.println("product"+productname);
           System.out.println("unit"+price);
           System.out.println("quantity"+quantity);
           System.out.println("discount"+discount);
           System.out.println("subtotal"+subtotal);
           System.out.println();

           totalitems +=quantity;
           originaltotal+=original;
           finaltotal+=subtotal;


        }

        double totalDiscount = originaltotal - finaltotal;
        double savings = (totalDiscount / originaltotal) * 100;

        System.out.println("Total Items: " + totalitems);
        System.out.println("Original Total: $" + originaltotal);
        System.out.println("Total Discount: $" + totalDiscount);
        System.out.println("Final Total: $" + finaltotal);
        System.out.println("Savings: " + String.format("%.2f", savings) + "%");

        sc.close();


    }
}
