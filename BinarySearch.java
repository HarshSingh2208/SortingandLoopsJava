package SearchingAndSorting.java;

import java.util.Scanner;

public class BinarySearch {
	
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
	public static int BinarySearch(int input[],int val) {
		int start=0;
		int end=(input.length)-1;
		while(start<=end)
		{
			int mid=(start+end)/2;
			if(input[mid]==val)
			{
				return mid;
			}
			else if(input[mid]>val)
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		
		int arr[]=TakeInput();
		Scanner st=new Scanner(System.in);
		int k=st.nextInt();
        int result=BinarySearch(arr,k);
        System.out.print(result);
	}

}
