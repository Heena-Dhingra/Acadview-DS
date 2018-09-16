import java.util.Scanner;
class Demo
{
	public static int[] sort(int[] arr)
	{
		for(int i = 0 ; i < (arr.length-1) ; i++)
		{
			for(int j = 0 ; j < (arr.length-1-i) ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				} 
			}
		}
		return arr;
	}

	public static void display(int[] arr)
	{
		for(int i = 0 ; i < (arr.length) ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
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

		int bubble[] = new int[n];
		bubble = sort(arr);
		display(arr);
	}
}