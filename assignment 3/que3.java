import java.util.Scanner;
class Demo
{
	public static int fibonacci(int num)
	{
		if(num == 1)
		{
			return 2;
		}
		else if(num == 2)
		{
			int res = fibonacci(1) + 1;
			return res; 
		}
		int res = fibonacci(num-1) + fibonacci(num-2);
		return res;
	}
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter nth number to be calculated");
		int n = sc.nextInt();

		
		int output = fibonacci(n-2);

		System.out.println("Nth number is: "+output);
	}	
}