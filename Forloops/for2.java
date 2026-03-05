package forloop;

import java.util.Scanner;

public class for2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int totalscore = 0;
        int passcount=0;
        int failcount=0;
        int highest=0;
      

        for (int i=0;i<n;i++){
            String s1 = sc. next();
            int score = sc.nextInt();
          String grade;

        if(score>=85){
            grade="A";
        }else if(score>=70){
            grade="B";
        }
        else if(score>=60){
            grade="C";
        }
        else if(score>=50){
            grade="D";
        }
        else{
            grade="F";
        }
    String status;
    if(score>=60){
        status="pass";
        passcount++;
    }else{
        status="Fail";
        failcount++;
    }
    totalscore+=score;

    if(score>highest){
        highest=score;

    }
    System.out.println("student"+s1);
    System.out.println("score"+score);
    System.out.println("grade"+grade);
    System.out.println("ststus"+status);
    System.out.println();
}

    double avg=totalscore/n;

    System.out.println("totalstudents"+n);
    System.out.println("class avg"+avg);
    System.out.println("students high score"+highest);
    System.out.println("passcount"+passcount);
    System.out.println("fail"+failcount);

    sc.close();


    }
}
