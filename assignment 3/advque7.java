import java.util.Scanner;
class Demo
{
	public static void countingBrackets(String str,char[] brackets, int[] flag)
	{
		if(str.length() == 0)
		{
			return;
		}
		if(str.charAt(str.length()-1) == '{' || str.charAt(str.length()-1) == '}')
			{
				flag[0]++;
			}
			else if(str.charAt(str.length()-1) == '[' || str.charAt(str.length()-1) == ']')
			{
				flag[1]++;
			}
			else if(str.charAt(str.length()-1) == '(' || str.charAt(str.length()-1) == ')')
			{
				flag[2]++;
			}
			String smallStr = str.substring(0,str.length()-1);
			countingBrackets(smallStr,brackets,flag);
			
	}
	
	public static boolean balancedBrackets(int[] flag,int index)
	{
		if(index == -1)
		{
			return true;
		}
		boolean output = balancedBrackets(flag,index-1);
			if(output)
			{
				if(flag[index] % 2 == 0)
				{
					System.out.println(flag[index] );
					return true;
				}
				else{
					return false;
				}
			}
			else
			{
				return false;	
			}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = sc.nextLine();

		char brackets[] = { '{' , '[' ,'(' , ')' , ']' , '}'};
		int flag[] = new int[3];
		
		countingBrackets(str,brackets,flag);
		int index = 2;
		boolean res = balancedBrackets(flag,index);

		
		for(int i =0 ; i < flag.length ; i++)
		{
			System.out.print(flag[i]+" ");
		}
		System.out.println();
		if(res)
		{
			System.out.println("Expression has balanced brackets");
		}
		else
		{
			System.out.println("Expression doesn't have balanced brackets");
		}

	}
}