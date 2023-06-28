import java.util.Scanner;

public class PrimeNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();

        System.out.print("Enter the value of 'n': ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        generatePrimeNumbers(start, end, n);

        scanner.close();
    }

    public static void generatePrimeNumbers(int start, int end, int n) {
        int count = 0;
        int number = start;

        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
            if (number > end) {
                break;
            }
        }

        System.out.println();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}

