import java.util.Scanner;

public class GeneratePrimes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of primes to be generated: ");
        int num = in.nextInt();

        System.out.print("Enter the range~ \nLower bound: ");
        int lb = in.nextInt();
        System.out.print("Upper bound: ");
        int ub = in.nextInt();

        in.close();

        System.out.println(num + " prime numbers in the given range are: ");
        int j = 0;
        for (int i = lb; i <= ub && j < num; i++) {
            if(isPrime(i)) {
                System.out.println(i + "  ");
                ++j;
            }
        }
        
        if(j < num) 
            System.out.printf("\n\tThere were only %d primes in between %d and %d", num, lb, ub);
        
    }

    static boolean isPrime(int n) {
        if(n<2)
            return false;

        int c = 2;
        while(c*c <= n) {
            if(n%c++ == 0)
                return false;
        }

        return true;
    }
}
