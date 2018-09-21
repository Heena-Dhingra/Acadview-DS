import java.util.Scanner;
class Demo
{
	public static void intersection(int[] arr1, int arr2[])
	{
		for(int i = 0 ; i < arr1.length ; i++)
		{
			for(int j = 0 ; j < arr2.length ; j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.print(arr1[i]+" ");
					arr2[j] = Integer.MAX_VALUE;
					break;
				}
				else
				{
					if(i == arr1.length-1 && j==arr2.length-1)
					{
						System.out.println("There are no common elements.");
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size");
		int  n = sc.nextInt();

		int arr1[] = new int[n];
		int arr2[] = new int[n];
		
		int i;
		System.out.println("Enter the first array");
		for( i = 0 ; i < n ; i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the second array");
		for( i = 0 ; i < n ; i++)
		{
			arr2[i] = sc.nextInt();
		}

		System.out.println("Output: ");
		intersection(arr1,arr2);
	}
}