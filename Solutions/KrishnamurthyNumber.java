import java.util.Scanner;

public class KrishnamurthyNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is a Krishnamurthy number.");
        } else {
            System.out.println(num + " is not a Krishnamurthy number.");
        }
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

