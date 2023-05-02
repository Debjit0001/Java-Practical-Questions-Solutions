import java.util.Scanner;

class TransposeMatrix {
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter dimension of the matrix:\nEnter the number of rows");
		int m = ob.nextInt();
		System.out.println("Enter the number of columns");
		int n = ob.nextInt();

		int[][] arr = new int[m][n];
		int[][] arr1 = new int[n][m];

		System.out.println("Enter elements of the matrix:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = ob.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr1[j][i] = arr[i][j];
			}
		}
		System.out.println();

		System.out.println("The transpose matrix of the corresponding matrix is:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}

		ob.close();
	}
}