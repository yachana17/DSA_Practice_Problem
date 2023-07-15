package Array_Question;

public class Binary_Search {
	public static int Search(int arr[], int item) {
		int si=0;
		int ei=arr.length-1;
		
		while(ei>=si) {
			int mid= (si+ei)/2;
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[mid]>item) {
				ei=mid+1;
				
			}
			else {
				si=mid-1;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,5,6,8,11,14,16};
		int item=11;
		System.out.println(Search(arr,item));
		
		

	}

}
