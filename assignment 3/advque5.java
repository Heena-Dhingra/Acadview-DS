import java.util.Scanner;
class Demo
{
	public static int sum(String str)
	{
		if(str.length() == 0)
		{
			return 0;
		}
		String smallStr = str.substring(0,str.length()-1);
		//System.out.println("substring: "+smallStr);
		//System.out.println("int: "+str.charAt(str.length()-1));
		int element = 0;
		element = Character.getNumericValue(str.charAt(str.length()-1));
		int res = element + sum(smallStr);
		//System.out.println("res :"+res);
		return res;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		String x = sc.nextLine();
		//System.out.println(x.length());

		int output = sum(x);
		System.out.println("The output is: "+output);
	}
}