public class MultipleCondiction
{
    public static void main(String[] args) {
        int x=10;
        if(x==0)
        {
            System.out.println("Number is zero");
        }
        else if(x<0)
        {
            System.out.println("Number is negativer");
        }
        else if(x>=0)
        {
            System.out.println("Number is possitive");
        }
        else
        {
            System.out.println("Number is invalid");
        }
    }
}
