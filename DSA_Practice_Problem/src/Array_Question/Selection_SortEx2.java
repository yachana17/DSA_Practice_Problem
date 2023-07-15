package Array_Question;

public class Selection_SortEx2 {
	public static void  SortEx(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			  int min=i;
			for (int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
				int temp = arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			
				
				
			}
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
