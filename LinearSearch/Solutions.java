public class Solutions
{
	public static int LinearSearch(int[] array, int x)
	{
		for( int  i = 0 ; i < array.length; i++)
		{
			if(array[i] == x)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Hello world");
		int [] array = {1,2,3,4,5,6,7,8,9,10};
					  //0,1,2,3,4,5,6,7,8,9
		int searchPosition = LinearSearch(array,4);
		System.out.println("The value is located at: " + searchPosition +" and the actual value of the position in the array is: "+array[searchPosition]);
	}
}