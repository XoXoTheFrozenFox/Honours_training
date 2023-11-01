//import System.util.*;
public class Solutions
{
	public static void main(String[] args)
	{
		//Scanner scan = new Scanner(System.in);
		//int test = scan.nextInt();
		int row = 3;
		int column = 3;
		System.out.println("Hello world");
		int[][] array1 = new int[row][column];
		int[] array2 = {1,2,3,4,5,6,7,8,9};
		int count = 0;
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < column ; j++)
			{
				array1[i][j] = array2[count];
				count++;
			}
		}
		for(int i = 0; i < row; i++)
		{
			for(int j = 0; j < column ; j++)
			{
				System.out.print(array1[i][j]+ " ");
			}
		}
		System.out.println(" ");
	}
}