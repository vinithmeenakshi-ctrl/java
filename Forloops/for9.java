package forloop;

import java.util.Scanner;

public class for9 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        int n =sc.nextInt();

        int totalcalories=0;
        int totalduration=0;


        for(int i=0;i<n;i++){
            String excesice = sc.next();
            int duration =sc.nextInt();

            int calories=0;
            String intensity=" ";

            if(excesice.equals("running")){
                calories=duration*10;
                intensity="high";
            }
            else if(excesice.equals("swimming")){
                calories=duration*12;
                intensity="high";
            }
            else if(excesice.equals("cycling")){
                calories=duration*8;
                intensity="moderate";
            }
            else if(excesice.equals("gym")){
                calories=duration*7;
                intensity="moderate";
            }
            else if(excesice.equals("walking")){
                calories=duration*4;
                intensity="low";
            }

            totalduration += duration;
            totalcalories += calories;

            System.out.println("excesice"+excesice);
            System.out.println("duration"+duration);
            System.out.println("calopries"+calories);
            System.out.println("intensity"+intensity);
            System.out.println();
            
            double avgcalories=totalcalories/n;

            String fitness;

            if(totalcalories<300){
                fitness="begginer";
            }
            else if(totalcalories<300 && totalcalories>1000){
                fitness="intermediate";
            }
            else{
                fitness="advanced";
            }

            System.out.println("totalduration"+totalduration);
            System.out.println("totslcaloriesburned"+totalcalories);
            System.out.println("average"+avgcalories);
            System.out.println("fitness"+fitness);
        
        }
    }
}
