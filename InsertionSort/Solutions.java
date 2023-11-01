public class Solutions
{
	public static void InsertionSort(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			int key = array[i];
			int j = i-1;
			while(j >= 0 && key < array[j])
			{
				array[j+1] = array[j];
				--j;
			}
			array[j+1] = key;
		}
	}
	public static void main(String[] args)
	{
		int[] array = {9,8,7,6,5,4,3,2,1,0};
		InsertionSort(array);
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("Hello world");
	}
}