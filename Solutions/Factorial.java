import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = ob.nextInt();
        ob.close();
        
        if (n < 0) {
            throw new ArithmeticException("Factorial is not possible for negative integer");
        }
        System.out.println("The factorial of this number is:" + fact(n));

    }

    static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;

    }
}
