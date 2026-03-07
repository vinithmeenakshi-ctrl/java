package forloop;

import java.util.Scanner;

public class for11 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        int n=sc.nextInt();
        double originaltotal=0;
        double finaltotal=0;


        for (int i=0;i<n;i++){
            String seattype=sc.next();
            String customertype=sc.next();

            double baseprice=0;
            int discount=0;
            if(seattype.equals("regular")){
                baseprice=12;
            }
            else if(seattype.equals("premium")){
                baseprice=18;
            }
            else if(seattype.equals("recliner")){
                baseprice=25;
            }

            if(customertype.equals("adult")){
                discount=0;
            }
            else if(customertype.equals("child")){
                discount=30;
            }
            else if(customertype.equals("senior")){
                discount=25;
            }

            double finalprice =baseprice*(1-discount/100);

            originaltotal+=baseprice;
            finaltotal+=finalprice;
         }
         boolean groupdiscount=false;

         if(n>=5){
            finaltotal= finaltotal*0.9;
            groupdiscount=true;
         }
         double totaldiscount = originaltotal-finaltotal;

         System.out.println("total tickets"+n);
         System.out.println("original total"+originaltotal);
         System.out.println("totaldiscount"+totaldiscount);
         System.out.println("finaltotal"+finaltotal);
         System.out.println("group discount"+(groupdiscount ?"yes":"no"));
         sc.close();



    }
}
