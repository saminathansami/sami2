import java.util.*;
public class Postivenegative 
{
    public static void main(String args[]) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        n = s.nextInt();
        if(n > 0)
        {
            System.out.println( " is Positive"+n);
        }
        else if(n < 0)
        {
            System.out.println( " is Negative"+n);
        }
        else
        {
            System.out.println( " is neither Positive nor Negative "+n);
        }
    }
}
