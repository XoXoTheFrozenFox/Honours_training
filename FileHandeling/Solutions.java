import java.io.*;
import java.io.IOException;
import java.util.Scanner;
public class Solutions
{
	
	public static void create()
	{
		System.out.println("Hello world");
		try
		{
			File myFile = new File("Text.txt");
			if(myFile.createNewFile())
			{
				System.out.println("File is created" + myFile.getName());
			}
			else
			{
				System.out.println("File already exists");
			}
		}
		catch(IOException e)
		{
			System.out.println("There was an error");
			e.printStackTrace();
		}		
	}
	
	public static String[] read()
	{
		String[] array = new String[6];//
		try
		{
			File myFile = new File("Text.txt");
			Scanner reader = new Scanner(myFile);
			int i = 0;//
			while(reader.hasNextLine())
			{
				String data = reader.nextLine();
				array[i] = data;//
				System.out.println(data);
				i++;//
			}
			reader.close();
		}
		catch(IOException e)
		{
			System.out.println("There was an error");
			e.printStackTrace();			
		}
		return array;//
	}
	
	public static void append()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Add the text you want to add to the file");
	    String text = input.nextLine();
		try
		{
			FileWriter writer = new FileWriter("Text.txt",true);
			writer.append(text).append(System.lineSeparator());
			writer.close();
			System.out.println("Sucessfully wrote to the file");
		}
		catch(IOException e)
		{
			System.out.println("There was an error");
			e.printStackTrace();
		}
	}
	
	public static void overWrite()
	{
		try
		{
			FileWriter writer = new FileWriter("Text.txt",false);
			writer.write("");
			writer.close();
			System.out.println("File was cleared sucessfully");
		}
		catch(IOException e)
		{
			System.out.println("There was an error");
			e.printStackTrace();
		}
	}

	public static void delete()
	{
		File myFile = new File("Text.bin");
		if(myFile.delete())
		{
			System.out.println("File is deleted: "+myFile.getName());
		}
		else
		{
			System.out.println("file was not found");
		}
	}
	
	public static void insertionSort(String[] array)
	{
		for(int i = 0 ; i < array.length ; i++)
		{
			String key = array[i];
			int j = i-1;
			while(j >= 0 && key.compareTo(array[j]) < 0)
			{
				array[j+1] = array[j];
				--j;
			}
			array[j+1] = key;
		}
	}
	
	public static void BubbleSort(String[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			for(int j = 0; j < array.length - i - 1 ; j++)
			{
				if(array[j+1].compareTo(array[j]) < 0)
				{
					String temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	public static int LinearSearch(String[] array, String x)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i].equals(x))
			{
				return i;
			}
		}
		return -1;
	}
	
	public static int BinarySearch(String[] array, String x)
	{
		for(int i = 0; i < array.length; i++)
		{
			int l = 0;
			int r = array.length -1;
			while(l <= r)
			{
				int m = l +(r-1)/2;
				if(array[m].equals(x))
				{
					return m;
				}
				else if(array[m].compareTo(x) < 0)
				{
					l = m + 1;
				}
				else
				{
					r = m - 1;
				}
			}	
		}
		return -1;
	}
	
	
	public static void appendSort(String[] array)
	{
		try
		{
			FileWriter writer = new FileWriter("Sorted.txt",true);
			for(int i = 0; i < array.length ; i++)
			{
				writer.append(array[i]).append(System.lineSeparator());
			}
			writer.close();
			System.out.println("Sucessfully wrote to the file");
		}
		catch(IOException e)
		{
			System.out.println("There was an error");
			e.printStackTrace();
		}
	}
	
		public static void readSort()
	{
		try
		{
			File myFile = new File("Sorted.txt");
			Scanner reader = new Scanner(myFile);
			while(reader.hasNextLine())
			{
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		}
		catch(IOException e)
		{
			System.out.println("There was an error");
			e.printStackTrace();			
		}
	}
	
	public static void main(String[] args)
	{
		//append();
		String[] data = read();
		System.out.println("");
		System.out.println("Sorted list");
		BubbleSort(data);
		System.out.print("The data of the txt: ");
		for (int i = 0; i < data.length ; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println("");
		System.out.print("The index of the txt: ");
		for (int i = 0; i < data.length ; i++)
		{
			System.out.print(i + "  ");
		}
		int index = BinarySearch(data,"Tieties");
		if(index != -1)
		{
			System.out.println("");
			System.out.println("The index of what you were looking for is: " + index);
			System.out.println("The actual data associated with the index is: " + data[index]);			
		}
		else
		{
			System.out.println("Record was not found in the file");
		}	
		appendSort(data);
		readSort();
	}
}