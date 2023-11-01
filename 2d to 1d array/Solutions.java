public class Solutions
{
	public static void main(String[] args)
	{
		System.out.println("Hello world");
		int[] array1 = new int[100];
		int[][] array2 = {{1,2,3},{4,5,6},{7,8,9}};
		int row = array2.length;
		int column = array2[0].length;
		for(int i = 0 ; i < row ; i++)
		{
			for(int j = 0 ; j < column ; j++)
			{
				int k = i * column + j;
				array1[k] = array2[i][j];
				k++;
			}
		}
		for(int i = 0 ; i < row ; i++)
		{
			for(int j = 0 ; j < column ; j++)
			{
				System.out.print(array1[i*column+j] + " ");
			}
		}
	}
}