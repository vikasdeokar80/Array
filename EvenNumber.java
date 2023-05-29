import java.sql.SQLOutput;
import java.util.ArrayList;

public class EvenNumber
{
    public static void main(String[] args)
    {
        int [] a={8,5,10,12,3,1,4};
        ArrayList<Integer>al1= new ArrayList<>();
        ArrayList<Integer>al2= new ArrayList<>();
        for(int i=0; i<a.length; i++)
        {
            if(a[i]%2==0)
            {
                al1.add(a[i]);
            }
            else
            {
                al2.add(a[i]);
            }
        }
        int total1=0;
        System.out.println("Even no's are");
        for(int no:al1)
        {  total1=total1 +no;
            System.out.println(no+" ");
        }
        System.out.println("Total no of even no are "+al1.size());
        System.out.println("Sum of all even no are :"+ total1);
        System.out.println("---------------------------------------------------");

        int total2=0;
        System.out.println("Odd no are");
        for(int no:al2)
        {  total2=total2+no;
            System.out.println(no+" ");
        }
        System.out.println("Total no of odd are :"+al2.size());
        System.out.println("sum of all odd no are:"+total2);
    }
}
