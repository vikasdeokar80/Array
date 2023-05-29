import java.util.Scanner;
public class Sum
{
    public void Sum(int no)
    {Scanner sc = new Scanner(System.in);
        System.out.println("Enter initil value");
        int i = sc.nextInt();
        System.out.println("Enter Final  value");
        int b = sc.nextInt();
        int sum;
        for( i=1;i<=b;i++)
        {
            sum=no+i;

            System.out.println("Total Sum ="+" "+sum);
        }
    }
    public static void main(String[] args) {


    }
}
