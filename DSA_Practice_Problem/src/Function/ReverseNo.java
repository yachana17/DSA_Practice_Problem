package Function;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner (System.in);
         int n = sc.nextInt();
         int rev;
         while(n>0) {
        	 rev = n%10;
        	 n=n/10;
        	 System.out.println(rev);
        	 
         }
	}

}
