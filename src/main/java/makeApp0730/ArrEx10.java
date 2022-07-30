package makeApp0730;

public class ArrEx10 {

	public static void main(String[] args) {
		
		//첫번째
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		int[][] matrix2 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		System.out.println("First");
			for(var i =0; i<matrix.length ; i++) {
				for(var j =0; j<matrix[i].length ; j++) {
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
		}
			
		System.out.println("Second");
			for(var i =0; i<matrix2.length ; i++) {
				for(var j =0; j<matrix2[i].length ; j++) {
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
		}	
	}

}


