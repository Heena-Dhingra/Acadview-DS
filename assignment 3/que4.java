import java.util.Scanner;
class Demo
{
	public static int power(int x,int y)
	{
		if( y == 0 )
		{
			return 1;
		}
		int res = x*power(x,y-1);
		return res;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int x = sc.nextInt();
		System.out.println("enter the power");
		int y = sc.nextInt();

		int output = power(x,y);
		System.out.println("The output is: "+output);
	}
}