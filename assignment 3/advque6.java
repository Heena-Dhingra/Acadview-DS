import java.util.Scanner;
class Demo
{
	public static String reduceDuplicateChar(String str)
	{
		if(str.length() == 1)
		{
			String res = str;
			return res;
		}
		if(str.charAt(0) != str.charAt(1))
		{
			String smallStr = str.substring(1,str.length());
			String res = str.charAt(0) + reduceDuplicateChar(smallStr);
			return res;
		}
		else
		{
			String smallStr = str.substring(1,str.length());
			String res = reduceDuplicateChar(smallStr);
			return res;
		}
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the word");
		String str1 = sc.nextLine();
		System.out.println(str1.length());

		String output = reduceDuplicateChar(str1);
		System.out.println("Final string is: "+output);
	}
}