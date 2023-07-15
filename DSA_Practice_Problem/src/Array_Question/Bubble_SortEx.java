package Array_Question;

public class Bubble_SortEx {
	public static void  BubbleSortEx(int arr[]) {
		for(int turn=0;turn<arr.length;turn++) {
			boolean flag=false;
			for (int i=0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					flag=true;
				}
				if(flag=false) {
					break;
				}
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {5,3,-7,4,8,2};
        BubbleSortEx(arr);
        for(int i=0;i<arr.length;i++) {
        	System.out.println(arr[i]+" ");
        }
        
//        System.out.println();
        
	}

}
