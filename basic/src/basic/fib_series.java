package basic;

import java.util.Scanner;

public class fib_series {
public static void main(String[]arrs) 
{ 
	Scanner sc=new Scanner(System.in);
	int f1=0,f2=1 sum=0;
	System.out.println("Enter the number of team:");
			int n= sc.nextInt();
			System.out.println("First"+n+"terms of fibonnaci series:");
			for(int i =1;i<=n;++i)
			{
				System.out.println(f1+" ");
				int sum= sum+f1;
				f1=f2;
				f2=f1;
	}
}
}