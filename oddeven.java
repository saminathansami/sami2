import java.util.*;
 
class Oddeven
{
   public static void main(String args[])
   {
      int x;
      System.out.println("Enter an integer to check if it is odd or even ");
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
 
      if ( x % 2 == 0 )
         System.out.println("it is  an even number.");
      else
         System.out.println("it is an odd number.");
   }
}
