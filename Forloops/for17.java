package forloop;
import java.util.Scanner;

public class for17 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        double finalfees=0;
        double totalrevenue=0;

        for (int i=0;i<n;i++){
            String membername=sc.next();
            String membership=sc.next();
            int daysuntilexpiry=sc.nextInt();

            int renewalfees=0;
            int discount=0;
            int urgentrenewals=0;
            if(membership.equals("basic")){
                renewalfees=50;
            }
            else if(membership.equals("premium")){
                renewalfees=100;
            }
            else{
                renewalfees=200;
            }


            if(daysuntilexpiry>=45){
                discount=20;
            }
            else if(daysuntilexpiry>=44){
                discount=15;
            }
            else if(daysuntilexpiry>=29){
                discount=10;
            }
            else{
                discount=0;
            }

            String priority;
            

            if(daysuntilexpiry<10){
                priority="urgent";
                urgentrenewals++;

            }
            else if(daysuntilexpiry<30){
                priority="high";

            }
            else {
                priority="normal";
            }
            finalfees=renewalfees*(1-discount/100);

            totalrevenue += finalfees;
            System.out.println("member"+membername);
            System.out.println("membership"+membership);
            System.out.println("days"+daysuntilexpiry);
            System.out.println("discount"+discount);
            System.out.println("priority"+priority);

            double average=totalrevenue/n;

            System.out.println("totalmembers"+n);
            System.out.println("urgentrenewals"+urgentrenewals);
            System.out.println("totalrenewal"+totalrevenue);
            System.out.println("aveage"+average);



        }
    }
    
}
