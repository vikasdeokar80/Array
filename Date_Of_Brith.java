
import java.util.Scanner;

public class Date_Of_Brith {
    public static void main(String[] args) {
        System.out.println("Enter Day");
        Scanner sc=new Scanner(System.in);
        int Day =sc.nextInt();
        System.out.println("Enter Month");
        int Month=sc.nextInt();
        System.out.println("Enter Year");
        int Year=sc.nextInt();

        System.out.println("Your Date of Birtdate is  :" + " " + Day+" / "+Month+" /"+Year );
    }

}
