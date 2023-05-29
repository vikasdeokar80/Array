
import java.util.Scanner;
public class Even
{
    public static void main(String[] args)
    {
        int sum=0;
        int count=0;
        for(int a=0;a<10;a++)
        {
            if(a%2==0)
            {
                sum=sum+a;
                count++;
            }
        }
        System.out.println("count of even number is"+" "+count);
    }}