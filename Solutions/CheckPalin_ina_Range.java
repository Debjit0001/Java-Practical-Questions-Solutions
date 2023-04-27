import java.util.Scanner;

public class CheckPalin_ina_Range {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the range:\nEnter the lower bound:");
        int m = ob.nextInt();
        System.out.println("Enter the upper bound:");
        int n = ob.nextInt();
        if (m < n) {
            for (int i = m; i <= n; i++) {
                if (checkPalin(i))
                    System.out.print(i + ",");
            }
        } else
            System.out.println("Enter the valid range");
        ob.close();
    }

    static boolean checkPalin(int n) {
        String str = String.valueOf(n);
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                return false;
        }
        return true;
    }
}
