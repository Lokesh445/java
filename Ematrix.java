public class Ematrix {

	public static void main(String[] args) {

		// declare & initialize 2D arrays for int and string
		int[][] matrix1 = new int[2][2];
		int matrix2[][] = new int[2][3];

           //the size of matrix3 will be 4x4
		int[][] matrix3 = { { 3, 2, 1, 7 },
					   { 9, 11, 5, 4 },
					   { 6, 0, 13, 17 },
					   { 7, 21, 14, 15 } };

		String[][] matrix4 = new String[2][2];

           //the size of matrix5 will be 2x3
           // 3 cols because at max there are 3 columns
		String[][] matrix5 = { { "a", "lion", "meo" },
				            { "jaguar", "hunt" } };
	}
}