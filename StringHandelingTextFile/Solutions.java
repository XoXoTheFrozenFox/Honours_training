import java.util.*;
import java.lang.*;
import java.io.*;
public class Solutions
{
	public static void create()
	{
		try
		{
			File myFile = new File("Text.txt");
			if(myFile.createNewFile())
			{
				System.out.println("File has been created: " + myFile.getName());
			}
			else
			{
				System.out.println("File already exists.");
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
		String[] array = new String[100];
		try
		{
			int i = 0;
			File myFile = new File("Text.txt");
			Scanner reader = new Scanner(myFile);	
			while(reader.hasNextLine())
			{
				String data = reader.nextLine();
				if(data != null)//NB
				{
					array[i] = data;
				}
				System.out.println(data);
				i++;
			}
			reader.close();
		}
		catch(IOException e)
		{
			System.out.println("There was an error");
			e.printStackTrace();
		}
		return array;
	}
	
	public static void write()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("What would you like to input into the textfile: ");
		String text = input.nextLine();	
		try
		{
			FileWriter writer = new FileWriter("Text.txt",true);
			writer.append(text).append(System.lineSeparator());
			writer.close();
			//System.out.println("The new data in the file is: ");
			//System.out.println("");
			//read();
		}
		catch(IOException e)
		{
			System.out.println("There was an error");
			e.printStackTrace();
		}
	}
	
	public static void clearFile()
	{
		try
		{
			FileWriter writer = new FileWriter("Text.txt",false);
			writer.write("");
			writer.close();
			System.out.println("File has been cleared successfully");
		}
		catch(IOException e)
		{
			System.out.println("There was an error");
			e.printStackTrace();		
		}
	}
	
	public static void delete()
	{
		File myFile = new File("Text.txt");
		if(myFile.delete())
		{
			System.out.println("File has been deleted");
		}
		else
		{
			System.out.println("File doesn't exist");
		}
	}
	
	public static void createName()
	{
		try
		{
			File myFile = new File("Name.txt");
			if(myFile.createNewFile())
			{
				System.out.println("File has been created: " + myFile.getName());
			}
			else
			{
				System.out.println("File already exists.");
			}
		}
		catch(IOException e)
		{
			System.out.println("There was an error");
			e.printStackTrace();
		}
	}	
	
	public static void createSurname()
	{
		try
		{
			File myFile = new File("Surname.txt");
			if(myFile.createNewFile())
			{
				System.out.println("File has been created: " + myFile.getName());
			}
			else
			{
				System.out.println("File already exists.");
			}
		}
		catch(IOException e)
		{
			System.out.println("There was an error");
			e.printStackTrace();
		}
	}	
	
	public static void clearFileName()
	{
		try
		{
			FileWriter writer = new FileWriter("Name.txt",false);
			writer.write("");
			writer.close();
		}
		catch(IOException e)
		{
			System.out.println("There was an error");
			e.printStackTrace();		
		}
	}
	
	public static void writeName(String[] array)
	{
		clearFileName();
		try
		{
			FileWriter writer = new FileWriter("Name.txt",true);
			for(int i = 0; i < array.length; i++)
			{
				if(array[i] != null)
				{
					writer.append(array[i]).append(System.lineSeparator());
				}
			}
			writer.close();
		}
		catch(IOException e)
		{
			System.out.println("There was an error");
			e.printStackTrace();
		}
	}
	
	public static void clearFileSurname()
	{
		try
		{
			FileWriter writer = new FileWriter("Surname.txt",false);
			writer.write("");
			writer.close();
		}
		catch(IOException e)
		{
			System.out.println("There was an error");
			e.printStackTrace();		
		}
	}
	
	public static void writeSurname(String[] array)
	{
		clearFileSurname();
		try
		{
			FileWriter writer = new FileWriter("Surname.txt",true);
			for(int i = 0; i < array.length; i++)
			{
				writer.append(array[i]).append(System.lineSeparator());
			}
			writer.close();
		}
		catch(IOException e)
		{
			System.out.println("There was an error");
			e.printStackTrace();
		}
	}
	
public static void bubbleSort(String[] array) 
{   
	
	for(int i = 0 ; i < array.length ; i++)
	{
		for(int j = 0 ; j < array.length-i-1 ; j++)
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

public static String[] removeNulls(String[] array) 
{
    return Arrays.stream(array)
                .filter(Objects::nonNull)
                .toArray(String[]::new);
}


	public static void main(String args[])
	{
		//write();
		String[] array = new String[100];
		array = read();
		array = removeNulls(array);
		bubbleSort(array);
		String[] name = new String[array.length];
		String[] surname = new String[array.length];
		System.out.println(" ");
		System.out.println("Fullnames: ");
		System.out.println(" ");
		for(int i = 0; i<array.length ; i++)
		{
			//for(int j = 0; j<array[i].length(); j++)
			//{
				//if(array[i].charAt(j) == (' '))
				//{
					//System.out.println(j);
				//}
			//}]
			String[] parts = array[i].split(" ",2);//Die belangrikste part, die 2 verteenwoordig 'n hy die parts keur. 2 beteken dat daar net 'n maks van twee parte kan wees, namens 0 en 1.
			name[i] = parts[0];//Part 1
			surname[i] = parts[1];// Part 2		
		}
		System.out.println(" ");
		System.out.println("Names: ");
		System.out.println(" ");
		for(int i = 0; i < array.length; i++)
		{
		System.out.println(name[i]);
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Surnames: ");
		System.out.println(" ");
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(surname[i]);
		}
		//createName();
		//createSurname();
		writeName(name);
		writeSurname(surname);
	}
}