package Array_Question;

import java.util.Scanner;

public class MaxElement {
	public static int Max(int arr[]) {
	 int max=arr[0];
	 for(int i=0;i<arr.length;i++) {
		 if(max<arr[i]) {
			 max=arr[i];
		 }
	 }
	 return max;
	 
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
         Scanner sc = new Scanner (System.in);
         int n= sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++) {
        	 arr[i]=sc.nextInt();
         }
         System.out.println(Max(arr));
        		 
	}

}
