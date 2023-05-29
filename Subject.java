import java.util.Scanner;
public class Subject
{
    public static void main(String[] args)
    { Scanner sc=new Scanner(System.in);
        System.out.println("Enter maths mark");
        int maths=sc.nextInt();
        System.out.println("Enter english mark");
        int english =sc.nextInt();
        System.out.println("Enter Science mark");
        int Science=sc.nextInt();
        System.out.println("Enter history mark");
        int history=sc.nextInt();
        System.out.println("Enter geography mark");
        int geography=sc.nextInt();

        int total =maths + english + Science + history + geography;
         float avg=total/5;
        System.out.println("Total of five subject marks :"+" "+  total);

        System.out.println("Average of five subject marks:"+" "+avg );


    }
}
