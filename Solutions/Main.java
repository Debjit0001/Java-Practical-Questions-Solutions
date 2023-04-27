import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      System.out.println("Enter a number:");
      Scanner ob = new Scanner(System.in);
      int n = ob.nextInt();
      if (checkArm(n))
         System.out.println("The number is an armstrong number");
      else
         System.out.println("The number is not an armstrong number");
      ob.close();
   }

   static boolean checkArm(int n) {
      int c = (int) (Math.log10(n) + 1);
      int p = n;
      int s = 0;
      while (n != 0) {
         int r = n % 10;
         s += (int) Math.pow(r, c);
         n /= 10;
      }
      return p == s;
   }
}
