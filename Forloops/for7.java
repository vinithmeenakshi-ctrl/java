package forloop;

import java.util.Scanner;

public class for7 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);


        int n=sc.nextInt();

        int totalunits=0;
        double  totalrevenue=0;

        for(int i=0;i<n;i++){
            String customerID=sc.next();
            int units=sc.nextInt();

            double bill=0;

            if(bill<=100){
                bill=units*0.10;
            }
            else if(bill<=200){
                bill=(units*0.10)+(units-100)*0.13;
            }
            else if(bill<=300){
                bill=(units*0.10)+(units*0.13)+(units-200)*0.16;
            }
            else{
                bill=(units*0.10)+(units*0.13)+(units*0.16)+(units-300)*0.20;
            }


            String catogory;
            if(units<=100){
                System.out.println("low");
            }
            else if(units<=200){
                System.out.println("medium");
            }
            else{
                System.out.println("high");
            }

            totalunits += units;
            totalrevenue+=bill;
        }
        double avgbill=totalrevenue/n;

         System.out.println("Total Consumers: " + n);
        System.out.println("Total Units Consumed: " + totalunits);
        System.out.println("Total Revenue: $" + totalrevenue);
        System.out.println("Average Bill: $" + String.format("%.2f", avgbill));

        sc.close();
    }
}
