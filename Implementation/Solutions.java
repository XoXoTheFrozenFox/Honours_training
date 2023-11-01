import java.io.*;
import java.io.IOException;
import java.util.Scanner;
public class Solutions
{
	public static void create()
	{
		try
		{
			File myFile = new File("Text.txt");
			if(myFile.createNewFile())
			{
				System.out.println("The file is created with name: "+myFile.getName());
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
	
	public static void read()
	{
		try
		{
			File myFile = new File("Text.txt");
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
	
	public static void write()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Give me some text");
		String text = input.nextLine();
		try
		{
			FileWriter writer = new FileWriter("Text.txt",true);
			writer.append(text).append(System.lineSeparator());
			writer.close();
			System.out.println("Your text was placed in the file");
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
			System.out.println("The file was deleted: " +myFile.getName());
		}
		else
		{
			System.out.println("File does not exist");
		}
	}
	public static void main(String[] args)
	{
		create();
		write();
		read();
	}
}