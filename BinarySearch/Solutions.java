public class Solutions
{
	public static int BinarySearch(int[] array, int x)
	{
		int l = 0;
		int r = array.length-1;
		while(l <= r)
		{
			int m = l + (r - 1)/2;
			if(array[m] == x)
			{
				return m;
			}
			else if(array[m] < x)
			{
				l = m+1;
			}
			else
			{
				r = m-1;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		System.out.println("Hello world");
		int[] array = {1,2,3,4,5,6,7,8,9,10};
				     //0,1,2,3,4,5,6,7,8,9
		int position = BinarySearch(array,10);
		System.out.println(position);
		if(position != -1)
		{
			System.out.println(array[position]);
		}
		else
		{
			System.out.println("Not found");
		}
		
	}
}