package Besic_Code;

import java.util.Scanner;

public class PalindromEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp;
		int sum=0;
		 temp=n;
		 while(n!=0) {
			 int rem =n%10;
			 sum=(sum*10)+rem;
			 n=n/10;
		 }
		 if(sum==temp) {
			 System.out.println("Palindrome");
		 }else {
			 System.out.println("Not Palindrome");
		 }
		 

	}

}
