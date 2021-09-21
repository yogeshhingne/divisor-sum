package ExceptionPack2;

import java.util.Scanner;

 
public class MyCalculator implements AdvAirthmatic{

	@Override
	public int divisorSum(int n) {
		// TODO Auto-generated method stub
		int s=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				s=s+i;
		}
		return s;
	}
	public static void main(String args[])
	{  
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		MyCalculator obj=new MyCalculator();
		System.out.println(obj.divisorSum(n));
	}
	
}
 