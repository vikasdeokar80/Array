
import java.util.Scanner;

public class Switchcase

{
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("your name :"+" "+name);
        switch (num){
        case 1:
        System.out.println("jaunvary");
        break;
        case 2:
        System.out.println("feburvary");
        break;
        case 3:
        System.out.println("March");
        break;
            case 4 :
                System.out.println("April");
           break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("jun");
                 break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("Aug");
                break;
            case 9:
                System.out.println("sep");
                break;
            case 10:
                System.out.println("Oct");
                break;
            case 11:
                System.out.println("Nov");
                break;
            case 12:
                System.out.println("Dec");
                break;
                default:
                    System.out.println("Enter valid number");

      // System.out.println("Enter vailid number");
    }
}}
