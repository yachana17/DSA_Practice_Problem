package Array_Question;

public class Sub_ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
         System.out.println(SubArray(arr));
	}
	public static int SubArray(int arr[]) {
		int ans = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				ans=Math.max(ans, sum);
				
			}
		}
		return ans;
		
	}

}
