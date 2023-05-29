
import java.util.Scanner;
public class Loop
{
    public static void main(String[] args) {

        int b = 10;
        int sum=0;
        int count=0;
        for (int a = 1; a <= b; a++) {
            if (a % 2 == 0) {
                sum = sum + a;
                count = a;
                System.out.println("Total count" + a);

            }

        }}}