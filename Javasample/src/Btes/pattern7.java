package Btes;

public class pattern7 {
public static void main(String args[])
{int i;
	for( i=1;i<=5;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(k);
		}
		for(int m=i-1;m>=1;m--)
		{
			System.out.print(m);
			
		}
	System.out.println();	
	}
	
}
}