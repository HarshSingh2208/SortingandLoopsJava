package MoreOnLoops.java;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		
		
		int num=0;
		while(n>1)
		{
			int temp=n%2;
			n=n/2;
			num=num*10+temp;
		}
		System.out.println(num);


	}

}
