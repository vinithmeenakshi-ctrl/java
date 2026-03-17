
import java.util.Scanner;
public class f3 {

public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    int n1= sc.nextInt();
    String n2= sc.next();

    for(int i=1;i<=n1;i++){
        for (int j=1;j<=i;j++){
            if(n2.equalsIgnoreCase("star")){
               System.out.print("*");
            }
            else if(n2.equalsIgnoreCase(".number")){
                System.out.print(j);
            }
        }
        System.out.println();

        }
        sc.close();
    }
}

