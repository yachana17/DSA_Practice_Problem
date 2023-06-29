package Function;

import java.util.Scanner;

public class Digit_Frequency {
	public static int DigitFreq(int n,int d) {
		int temp=0;
		while(n>0) {
			int dig =n%10;
			n=n/10;
			if(dig == d) {
				temp++;
			}
		}
	 return temp;	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int Num= sc.nextInt();
		int d= sc.nextInt();
		int f= DigitFreq(Num,d);
		System.out.println(f);
		
		
		

	}

}
