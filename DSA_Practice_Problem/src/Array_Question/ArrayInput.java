package Array_Question;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr [] = {2,3,4,5,6,8};
		ArrayList<Integer> li =new ArrayList<>();
		Scanner sc= new Scanner (System.in);
		 int n= sc.nextInt();
		int arr [] = new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]+" ");
//		}
		 
		 for(int i=0;i<arr.length;i++) {
			 li.add(arr[i]);
		 }
		 
		 for(int i=0;i<li.size();i++) {
			 System.out.print(li.get(i)+" ");
		 }
	        

	}

}
