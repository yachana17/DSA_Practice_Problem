package Besic_Code;

import java.util.Scanner;

public class PrintOneToNth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int End = sc.nextInt();
		System.out.println("Print 1 to "+End+ "prime no ");
	    for(int i=2;i<=End;i++) {
	    	int count=0;
	    	for(int j=1;j<=i;j++) {
	    		if(i%j==0) {
	    			count++;
	    		}
	    	}
	    	if (count==2) {
	    		System.out.println(i+" ");
	    	}
	    }

	}

}
