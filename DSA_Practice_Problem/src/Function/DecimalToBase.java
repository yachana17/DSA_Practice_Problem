package Function;

import java.util.Scanner;

public class DecimalToBase {
	public static int DecimalToAnyBase(int n,int b) {
		int temp =0;
		int p=1;
		while(n>0) {
			int dig = n%b;
			n=n/b;
			temp  =+ dig*p;
			p =p *10;
		}
		return temp;
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int b =sc.nextInt();
		int  Dec = DecimalToAnyBase(n,b);
		System.out.println(Dec);

	}

}
