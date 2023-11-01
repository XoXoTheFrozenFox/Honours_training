public class Solutions
{
	public static void BinarySort(String[] array, int n)
	{
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n- i -1; j++)
			{
				if(array[j].compareTo(array[j+1]) > 0)
				{
					String temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Hello World");
		String[] array = {"jR9pXzWvY4","Qs3KtHmP7L","6aGfNqRzD8","Bw1XyVtZoP","L7eKpFmRi2","3oN9vTcQjP","Gx5ZbYwRlQ","M2sKpFzHvW","D4jNvRwTqP","9cXpYzKoJi"};
		BinarySort(array,array.length);
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
}