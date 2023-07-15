package Array_Question;

public class Insertion_SortEx3 {
	public static void  SortEx(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			  int item= arr[i];
			  int j=i-1;
			  while(j>=0 &&arr[j]>item) {
				  arr[j+1]=arr[j];
				  j--;
				
				
			}
			  j++;
			  arr[j]=item;
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {5,3,-7,4,8,2};
        SortEx(arr);
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
        
//        System.out.println();
        
	}

}
