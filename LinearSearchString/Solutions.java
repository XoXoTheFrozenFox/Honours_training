public class Solutions
{
	public static int LinearSearch(String[] array, String x)
	{
		for(int i = 0; i < array.length ; i++)
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
		String[] array = {"AA","AB","AC","AD","AE","AF","AG","AH","AI","AJ","AK","AL"};
		int position = LinearSearch(array,"AB");
		System.out.println(position);
		System.out.println(array[position]);
	}
}