package Array_Question;

public class Product_ItSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,3,4,5};
		int [] ans=Product_ArrayEx(arr);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]+" ");
		}

	}
	public static int[] Product_ArrayEx(int arr[]) {
		int []left= new int [arr.length];
		   left[0]=1;
		   for(int i=1;i<left.length;i++) {
			   left [i]=left[i-1]*arr[i-1];
		   }
		   int []right=new int[arr.length];
		   int n= arr.length;
		   right[n-1]=1;
		   for(int i=n-2;i>=0;i--) {
		   right[i]=right[i+1]*arr[i+1];
		   }
		   for(int i=0;i<right.length;i++) {
			   left [i]=left[i]*right[i];
		   }
		   return left;
		   
		   
		
		
		
	}

}
