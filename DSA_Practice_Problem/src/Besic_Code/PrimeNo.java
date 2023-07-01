package Besic_Code;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		
		 boolean count=false;
		for(int i=2;i<n/2;i++) {
		  if(n%i==0) {
			  count= true;
			  break;
			  
		  }
		}
		if (!count) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}

	}

}
