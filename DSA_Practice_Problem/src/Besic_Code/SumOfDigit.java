package Besic_Code;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp;
		int sum=0;
		 temp=n;
		 while(n!=0) {
			 int rem =n%10;
			 sum=sum+rem;
			 n=n/10;
		 }
		 
			 System.out.println(sum);
		 }
		 

	

}
