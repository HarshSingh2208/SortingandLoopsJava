package MoreOnLoops.java;
import java.util.Scanner;
public class SumOrProduct {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int c=s.nextInt();
		if(c==1)
		{
			int ans=0;
			while(n>0)
			{
				ans=ans+n;
				n=n-1;
			}
			System.out.println(ans);
			
		}
		else
		{
			int ans=1;
			while(n>0)
			{
				ans=ans*n;
				n=n-1;
			}
			System.out.println(ans);
		}
		
		
	}

}
