import java.util.Scanner;

public class MatrixMulti {
    public static void main(String[] args) {
        try (Scanner ob = new Scanner(System.in)) {
            System.out.println("Enter dimension of the first matrix:\nEnter the number of rows:");
            int r1 = ob.nextInt();
            System.out.println("Enter the number of columns:");
            int c1 = ob.nextInt();
            System.out.println("Enter dimension of the second matrix:\nEnter the number of rows:");
            int r2 = ob.nextInt();
            System.out.println("Enter the number of columns:");
            int c2 = ob.nextInt();

            if (c1 == r2) {
                int[][] M1 = new int[r1][c1];
                System.out.println("Enter elements of the first matrix:");
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c1; j++) {
                        M1[i][j] = ob.nextInt();
                    }
                }

                int[][] M2 = new int[r2][c2];
                System.out.println("Enter elements of second matrix:");
                for (int i = 0; i < r2; i++) {
                    for (int j = 0; j < c2; j++) {
                        M2[i][j] = ob.nextInt();
                    }
                }

                int[][] M3 = new int[r1][c2];
                int sum;
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c2; j++) {
                        sum = 0;
                        for (int k = 0; k < c1; k++) {
                            sum += M1[i][k] * M2[k][j];
                        }
                        M3[i][j] = sum;
                    }
                }

                System.out.println("The resultant matrix is:");
                for (int i = 0; i < r1; i++) {
                    for (int j = 0; j < c2; j++) {
                        System.out.print(M3[i][j] + " ");
                    }
                    System.out.println();
                }

            } else {
                throw new IllegalArgumentException("Matrix multiplication is not possible ");
            }
        }
        
    }
}