import java.util.Scanner;

public class Pattern_Q45 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = in.nextInt();
        in.close();

        int n = row;
        for(int i = 1; n>=1; i+=n, n--) {
            int k = n;
            for(int j = i; k <= row; j-=k, k++)
                System.out.print(j + " ");

            System.out.println();
        }
    }
}
