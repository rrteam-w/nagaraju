public class MultiDimensionalArrays {

	public static void main(String args[]) {

		int[] numbers = {3, 45, 135};
		System.out.println("Single Dimensional Array: {3, 4, 135}");
		System.out.println("value of second element in array is :" + numbers[2]);

		System.out.println("===================================");

		System.out.println("Multi Dimensional Array:");
		System.out.println("===================================");
		
		System.out.println("Array of Array of numbers:{{2,3,5}, {3,4}, {7,9,10}}");
		int[][] grid = {
			{2,3,5},
			{3,4},
			{7,9,10}
		};

		for(int i = 0; i< grid.length; i++) {
			for(int j=0; j<grid[i].length; j++) {
				System.out.println("Value in grid["+i+"]["+j+"] is " + grid[i][j]);
			}
		}

		System.out.println("===================================");
		
		System.out.println("Array of Array of Strings:{{'Apple','Banana','Grapes'}, {'Suzuki','Toyoto'}, {'Sachin','Ganguly','Dravid'}}");
		
		String[][] strings = {
			{"Apple","Banana","Grapes"}, 
			{"Suzuki","Toyoto"}, 
			{"Sachin","Ganguly","Dravid"}
		};

		for(int i = 0; i< strings.length; i++) {
			for(int j=0; j<strings[i].length; j++) {
				System.out.println("Value in strings["+i+"]["+j+"] is " + strings[i][j]);
			}
		}

		System.out.println("===================================");

	}

}