import java.util.Scanner;

public class PredefinedException {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = ob.nextInt();
        ob.close();
        
        divide(n);
    }

    static void divide(int n) throws ArithmeticException {
        int m = 0;
        if (m == 0) {
            throw new ArithmeticException("Please don't divide by zero");
        }
        else{
            System.out.println(n/m);
        }
    }
}
