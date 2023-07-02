package Array_Question;

import java.util.Scanner;

public class Array_Swap_1 {
	 public static void SwapArray(int arr[],int a,int b)
	 {
		 int temp = arr[a];
		 arr [a]=  arr[b];
		 arr[b]=temp;
		 
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		int arr []= new int [n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
			}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		SwapArray(arr,0,1);
		System.out.println(arr[0]+" "+arr[1]);

	}

}
