import java.util.Scanner;
class Demo
{
	public static int maximum(int[] arr)
	{
		int a = arr[0];
		for(int i = 0; i < arr.length ; i++)
		{
			if(arr[i] > a)
			{
				a = arr[i];
			}
		}
		return a;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size");
		int  n = sc.nextInt();

		int arr[] = new int[n];

		int i;
		System.out.println("Enter the array");
		for( i = 0 ; i < n ; i++)
		{
			arr[i] = sc.nextInt();
		}

		System.out.println("Maximum value in array is: "+maximum(arr));
	}
}