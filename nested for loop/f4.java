import java.util.Scanner;
public class f4 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        int students=sc.nextInt();
        int subjects=sc.nextInt();
        sc. nextLine();


        String[] names = new String[students];
        int [][] marks = new int[students][subjects];

        for(int i=0;i<students;i++){
            names[i]=sc.next();
            for(int j=0;j<subjects;j++){
                marks[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("grade sheet");

        System.out.print("student");
        for(int j=0;j<subjects;j++){
            System.out.print("sub"+(j+1)+ " ");
        }
        System.out.println("Average");

        for(int i=0;i<students;i++){
            double sum=0;

            System.out.print(names[i]+" ");

            for(int j=0;j<subjects;j++){
                System.out.println(marks[i][j]+" ");
                sum += marks[i][j];
            }
            double average = sum/subjects;
            System.out.printf("%.2f\n",average);
        }
        sc.close();

    }
}
