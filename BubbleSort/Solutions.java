public class Solutions
{
	public static void BinarySort(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array.length- i -1; j++)
			{
				if(array[j+1] < array[j])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		int[] array = {9,8,7,13,6,5,4,3,2,1,0,11};
		BinarySort(array);
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
}