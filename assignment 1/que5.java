import java.util.Scanner;
class Demo
{
	public static void reverse(int[] arr)
	{
		int temp,start = 0,end = (arr.length-1);
		while(start<end)
		{
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	public static void display(int[] arr)
	{
		for(int i = 0; i < arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i<n ;i++)
		{
			 arr[i] = sc.nextInt();
		}
		reverse(arr);
		System.out.println("Reversed array :");
		display(arr);
	}
}