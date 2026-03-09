package forloop;
import java.util.Scanner;

public class for16 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();
        int passcount=0;
        int failcount=0;
        int totalscore=0;
        int highestscore=0;
        int score=0;
        for(int i=0;i<n;i++){
            String studentname=sc.next();
            int correctanswers=sc.nextInt();
            int wronganswers=sc.nextInt();
            int unattemoted=sc.nextInt();

            score=(correctanswers*4)-(wronganswers*3)+(unattemoted*0);

            String result;

            if(score>=32){
                result="pass";
                passcount++;

            }
            else{
                result="fail";
                failcount++;
            }
            if(score>highestscore){
                highestscore=score;
            }
            totalscore +=score;
            System.out.println("student"+studentname);
            System.out.println("correct"+correctanswers);
            System.out.println("wrong"+wronganswers);
            System.out.println("unattempted"+unattemoted);
            System.out.println("score"+score);
            System.out.println("result"+result);
            System.out.println();

            double average=(double) totalscore/n;

            System.out.println("totalstudentd"+n);
            System.out.println("passcount"+passcount);
            System.out.println("failcount"+failcount);
            System.out.println("average"+average);
            System.out.println("highscore"+highestscore);
            }

        }
    }


