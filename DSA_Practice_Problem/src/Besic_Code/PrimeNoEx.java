package Besic_Code;

import java.util.Scanner;

public class PrimeNoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		 
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			 
		       boolean count=false;
			for(int div=2;div<=a;div++) {
				if(n%div ==0) {
					count=true;
					break;
				}
				
			}
			if(!count) {
				System.out.println("Prime");
			}else {
				System.out.println("Not Prime");
			}
		}
		

	}

}
