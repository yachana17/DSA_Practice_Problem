package Besic_Code;

import java.util.Scanner;

public class CountDigitEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt();
		int dig=0;
		  while(n!=0) {
			   n= n/10;
			   dig++;
			   
		  }
		  System.out.println(dig);

	}

}
