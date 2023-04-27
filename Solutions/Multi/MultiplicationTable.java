package Multi;

import java.util.Scanner;

public class MultiplicationTable {
  
        public static void main(String[] args) {
            System.out.println("Enter a number:");
            Scanner ob=new Scanner(System.in);
            int n=ob.nextInt();
            System.out.println("The multiplication table is:");
            MTable.Mul(n);
            ob.close();
        }    
        
}
