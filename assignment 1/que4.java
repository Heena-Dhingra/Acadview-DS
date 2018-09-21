import java.util.Scanner;
class Demo
{
	public static void wavePrintform(int matrix[][],int rows)
	{
		int curRow = 0, curColumn = 0, index = 0;
		//System.out.println("array length" + arr.length);
		while(curRow < rows)
		{
			if(curRow%2 == 0)
			{
				while(curColumn < matrix[0].length)
				{
					//arr[index] = matrix[curRow][curColumn];
					System.out.print(matrix[curRow][curColumn]+" ");
					//index++;
					/*
					if(index == arr.length)
					{
						break;
					}
					*/
					curColumn++;
				}
				
			}
			
			//System.out.print("matrix[0].length-1 "+(matrix[0].length-1));
			else
			{
				
				while(curColumn > 0)
				{
					
					curColumn--;
					//arr[index] = matrix[curRow][curColumn];
					System.out.print(matrix[curRow][curColumn]+" ");
					//index++;
					
					/*
					if(index == arr.length)
					{
						break;
					}
					*/
				}

				
			}
			curRow++;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter number of rows");
		int rows = sc.nextInt();
		System.out.println("enter number of columns");
		int columns = sc.nextInt();

		int matrix[][] = new int[rows][columns];
		int length = (rows*columns);
		int arr[] = new int[length];

		System.out.println("Enter the input for matrix: ");
		for(int i = 0 ; i < rows ; i++)
		{
			for(int j = 0 ; j < columns ; j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("matrix length"+matrix[0].length);

		wavePrintform(matrix,rows);
		/*
		System.out.println("hey");
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		*/
		/*
		System.out.println("output");
		for(int i = 0 ; i < rows ; i++)
		{
			for(int j = 0 ; j < columns ; j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		*/
	}
}