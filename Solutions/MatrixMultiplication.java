import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] A = new int[3][3];
        System.out.println("Enter matrix A (3x3):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element (" + (i+1) + "," + (j+1) + "): ");
                A[i][j] = scanner.nextInt();
            }
        }


        int[][] B = new int[3][4];
        System.out.println("Enter matrix B (3x4):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter element (" + (i+1) + "," + (j+1) + "): ");
                B[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        int[][] C = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 3; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }


        System.out.println("AxB:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}