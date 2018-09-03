package algo.sorting;

public class HourGlass {

	public static void main(String[] args) {
		int matrix[][] = {
		                  {10,2,3,7,8,12},
		                  {4,9,12,7,9,11},
		                  {11,12,13,21,21,32},
		                  {13,16,23,21,11,66},
		                  {42,23,32,32,43,32},
		                  {32,43,3,32,32,53}
		                  };
		int row = matrix[0].length;
		int col = matrix.length;
		HourGlass.MaxSum(matrix, row, col);

	}
	
	public static void MaxSum(int mat[][],int row,int col) {
		int sum = 0;
		for(int i = 0; i < row - 2; i++) {
			for(int j = 0; j < col - 2; j++) {
				int total = (mat[i][j] + mat[i+1][j] + mat[i+2][j]) +
						(mat[i+1][j+1]) + (mat[i+2][j]+ mat[i+2][j+1]+mat[i+2][j+2]);
				sum = Math.max(total, sum);
			}
			
		}
		System.out.println("Max sum"+sum);
	}

}
