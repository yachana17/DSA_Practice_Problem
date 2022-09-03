
public class Binary_Search {
	public static int binarySearch(int arr[],int item) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[mid]>item) {
				end=mid-1;
			}else {
				start=mid+1;
			}
			
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,6,7,8,9,11,14,18,24};
		int item=1;
		System.out.println(binarySearch(arr,item));
		

	}
	

}
