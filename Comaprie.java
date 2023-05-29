import java.util.Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Comaprie
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String");
        String name1=sc.nextLine();
        System.out.println("Enter Second String");
        String name2=sc.nextLine();

        if(name1==name2)
        {
            System.out.println("Both String is equale");
        }
        else
        {
            System.out.println("String not equale");
        }


    }
}
