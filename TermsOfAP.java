package MoreOnLoops.java;
import java.util.Scanner;
public class TermsOfAP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(n>0)
        {
            int temp=(3*i)+2;
            if(temp%4!=0)
            {
                System.out.print(temp+" ");
                n=n-1;
            }
            i=i+1;
        }

	}

}
