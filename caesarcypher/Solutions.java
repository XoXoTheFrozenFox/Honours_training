public class Solutions
{
	public static StringBuffer encrypt(String text, int s)
	{
		StringBuffer result = new StringBuffer();
		for(int i = 0 ; i < text.length(); i++)
		{
			if(text.charAt(i) == '_')
			{
				result.append("_");
			}
				else if(Character.isUpperCase(text.charAt(i)))
			{
                char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);
                result.append(ch);
			}
			else
			{
                char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);
				result.append(ch);
			}
		}
		return result;
	}
	public static void main(String[] args)
	{
		System.out.println("Hello world");
		String text = ("Bernard_Swanepoel_en_Frikkie");
		StringBuffer result = new StringBuffer();
		result = encrypt(text,3);
		System.out.println(result);
	}
}