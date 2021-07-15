package SearchingAndSorting.java;

import java.util.Scanner;

public class InsertionSort {
     
	public static int[] TakeInput() {
		Scanner s = new Scanner(System.in);
		int size=s.nextInt();
		int input[]=new int[size];
		for(int i=0;i<size;i++)
		{
			input[i]=s.nextInt();
		}
		
		return input;
	}
	
	public static void Print(int input[]) {
		int size=input.length;
		for(int i=0;i<size;i++)
		{
			System.out.print(input[i]+" ");
		}
		
	}
	public static void InsertionSort(int input[]) {
		for(int i=1;i<input.length;i++)
		{
			int j=i-1;
			int temp=input[i];
			while(j>=0 && input[j]>temp)
			{
				input[j+1]=input[j];
				j--;
			}
			input[j+1]=temp;
		}
	}
	
	public static void main(String[] args) {
		
		int arr[]=TakeInput();
        InsertionSort(arr);
        Print(arr);
		
	}

}
