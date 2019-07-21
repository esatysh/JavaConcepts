package arrayConcepts;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using a 2D array
		
		int[][] a={{1,2,3},
				   {4,5,6},
				   {7,8,9}};
		
		System.out.println(a[0][1]);
		
		//using the enhanced 'for loop' to read a 2D array
		
		for(int i[]:a)
		{
			for(int j:i)
			{
				System.out.println(" "+j);
		}
		}
			
		
	}

}
