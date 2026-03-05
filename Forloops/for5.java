package forloop;

import java.util.Scanner;

public class for5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int n =sc.nextInt();
        double totaloccupancy=0;
        double peakoccupancyrate=0;
        int peakday=0;
        int fulldayscount=0;
        double roomsoccupied;
        double totalrooms;
        int maxoccupancy;
        int sum;
        for(int i=0;i<n;i++){
            int day =sc.nextInt();
            int rooms = sc.nextInt();
            double occupancyrate  = (roomsoccupied/totalrooms)*100;
            totaloccupancy += occupancyrate;

            String status;
            if(occupancyrate<60){
                status = "low";

            }
            else if(occupancyrate<80){
                status = "moderate";
            }
            else if(occupancyrate<100){
                status = "High";
            }
            else{
                status = "Full";
                fulldayscount++;
            }

            if(occupancyrate>maxoccupancy){
                maxoccupancy=occupancyrate;
                peakday=i;
            }
             System.out.println("Day: " + day);
            System.out.println("Rooms Occupied: " + roomsoccupied);
            System.out.println("Total Rooms: " + totalrooms);
            System.out.printf("Occupancy Rate: %.2f%%%n", occupancyrate);
            System.out.println("Status: " + status);
            System.out.println();
        }
         double averageOccupancy = sum / n;
        System.out.println("Total Days Analyzed: " + n);
        System.out.printf("Average Occupancy Rate: %.2f%%%n", averageOccupancy);
        System.out.println("Peak Occupancy Day: Day " + peakday);
        System.out.println("Days at Full Capacity: " + fulldayscount);

        sc.close();
        
         

        }

    }

