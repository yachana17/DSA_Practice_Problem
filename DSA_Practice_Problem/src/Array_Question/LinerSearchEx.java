package Array_Question;

import java.util.Scanner;

	 
 
public class LinerSearchEx {
	 public static void LinerSearch(int arr[],int item ) {
		 
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]==item) {
				System.out.println("item found index"+i);
			 }
				 
		 }
		 
		 System.out.println("item not found");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n = sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.print("item who want to search");
		int item =sc.nextInt();
//		for(int i=0;i<n;i++) {
//			System.out.println(arr[i]+" ");
//		}
		LinerSearch(arr,item);

	}

}
