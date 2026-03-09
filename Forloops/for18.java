package forloop;
import java.util.Scanner;

public class for18 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        double totaltemp=0;
        double highest_temperature=0;
        double lowest_temperature=0;
        int high_hour=0;
        int low_hour=0;
       int hothours=0;
       int coldhours=0;

        for(int i=0;i<n;i++){
            int hour=sc.nextInt();
            Double temperature=sc.nextDouble();

            String status;
            if(temperature>40 || temperature<0){
                status="Extreme";
            }
            else if(temperature<40){
                status="hot";
            }
            else if(temperature<10){
                status="cold";
            }
            else{
                status="normal";
            }
            if(temperature>=32){
                hothours++;
            }
             if(temperature<=10){
                coldhours++;
            }
            if(temperature>highest_temperature){
                highest_temperature=temperature;
                high_hour=hour;
            }
             if(temperature<lowest_temperature){
                lowest_temperature=temperature;
                low_hour=hour;
                
            }
             totaltemp += temperature;

            System.out.println("hour"+hour+temperature);
            System.out.println("status"+status);
            System.out.println();
        }
            double average=totaltemp/n;

            System.out.println("readings"+n);
            System.out.println("avg"+average);
            System.out.println("hightemp"+highest_temperature+high_hour);
            System.out.println("lowtemp"+lowest_temperature+low_hour);
            System.out.println("hothours"+hothours);
            System.out.println("cold"+coldhours);


        }
    }
