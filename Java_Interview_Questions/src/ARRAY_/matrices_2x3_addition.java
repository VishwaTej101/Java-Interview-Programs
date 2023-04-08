package ARRAY_;

import java.util.*;

public class matrices_2x3_addition {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int row = s.nextInt();
		int col = s.nextInt();

		int mat1[][] = new int[row][col];
		int mat2[][] = new int[row][col];
		int result[][] = new int[row][col];

		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[i].length; j++) {
				mat1[i][j] = s.nextInt();

			}
		}

		for (int i1 = 0; i1 < mat2.length; i1++) {
			for (int j = 0; j < mat2[i1].length; j++) {
				mat2[i1][j] = s.nextInt();
			}
		}

		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2[i].length; j++) {
				result[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}
