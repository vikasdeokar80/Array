import java.util.Scanner;
public class Sumof
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any number");
        int num=sc.nextInt();
        switch(num)
    {case 1:
        System.out.println("One");
        break;
        case 2:
             System.out.println("Two");
             break;
         case 3:
             System.out.println("Three");
             break;
         case 4:
             System.out.println("four");
             break;
         case 5:
             System.out.println("five");
             break;
        case 6:
            System.out.println("Six");
            break;
        case 7:
            System.out.println("Seven");
            break;
        case 8:
            System.out.println("eight");
            break;
        case 9:
            System.out.println("Nine");
            break;
        case 10:
            System.out.println("Ten");
            break;

         default:
             System.out.println("Enter Invailide number");
     }
    }}