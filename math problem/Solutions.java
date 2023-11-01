import java.util.Scanner;
import java.lang.Math;
public class Solutions
{
	public static boolean testNum(int number)
	{
		String stringNumber =Integer.toString(number);
		int length = stringNumber.length();
		int testNumber = 0;
		System.out.println(length);
		for(int i = 0; i < length; i++)
		{
			int digit = Character.getNumericValue(stringNumber.charAt(i));
			testNumber += Math.pow(digit, length);
		}
		System.out.println(testNumber);
		if(testNumber == number)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args)
	{
		System.out.println("Hello world");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value you want to test:	");
		int number = input.nextInt();
		boolean value = testNum(number);
		System.out.println(value);
	}
}