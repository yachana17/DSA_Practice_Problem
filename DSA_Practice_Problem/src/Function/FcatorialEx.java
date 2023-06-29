package Function;

import java.util.Scanner;


public class FcatorialEx {
	public static void main(String aregs[]) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		int nfact = fact(n);
		int nmfact=fact(n-r);
		 int npr = nfact/nmfact;
		 display(n,r,npr);
		
		
		
	}
	public static void display(int n,int r,int npr) {
		System.out.println(n+"p"+r+"="+npr);
		
	}
	
	public static int fact(int x) {
		int rv =1;
		for(int i=1;i<=x;i++ ) {
			rv=rv*i;
		}
		return rv;
		
	}

}
