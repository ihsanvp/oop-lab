import java.util.*;
public class matrix
{
	public static void main(String arg[])
	{
		int r1,r2,c1,c2,k,i,j;
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the size of the row of the first matrix");
		r1 = s.nextInt();
		System.out.println("Enter the size of the coloumn of the first matrix");
		c1 = s.nextInt();
		System.out.println("Enter the size of the row of the second matrix");
		r2 = s.nextInt();
		System.out.println("Enter the size of the coloumn of the second matrix");
		c2 = s.nextInt();
		int a[][] = new int[r1][c1];
		int b[][] = new int [r2][c2];
		int result[][] = new int[r1][c2];
		if(c1==r2)
		{
			System.out.println("Enter the elements in the matrix A");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					a[i][j]= s.nextInt();		
				}
	     		}	
			System.out.println("Enter the elements in the matrix B");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				{
					b[i][j]= s.nextInt();		
				}
	     		}
			System.out.println();	
			System.out.println("The matrix A is");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					System.out.print(a[i][j]+"      ");		
				}
				System.out.println();		
			}
			System.out.println();
			System.out.println("The matrix B is");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				{
					System.out.print(a[i][j]+"      ");		
				}
				System.out.println();
			}	
			System.out.println();
			System.out.println("The matrix result is");
			for(i=0;i<r1;i++)	
			{
				for(j=0;j<c1;j++)
				{
					for(k=0;k<c1;k++)
					{
						result[i][j]+=a[i][k]*b[j][k];
					}
					System.out.print(result[i][j]+" ");
				}
				System.out.println();	
			}		
		}
		else
			System.out.println("Matrix multiplication not possible");
	}
}
