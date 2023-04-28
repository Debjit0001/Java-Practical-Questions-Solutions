import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = ob.nextInt();
        System.out.println("Enter the second number:");
        int b = ob.nextInt();
        System.out.println("Enter the third number:");
        int c = ob.nextInt();
        System.out.println("The maximum number is:" + ((a > b ? a : b) > c ? (a > b ? a : b) : c));
        ob.close();
    }
}