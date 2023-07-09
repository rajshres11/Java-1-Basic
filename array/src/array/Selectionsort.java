package array;

public class Selectionsort {
    
	public static void printarray(int[]arr) {
		int n=arr.length;
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
	public static  void selectionsort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			// insert element at  i position
			int min= Integer.MAX_VALUE;
			int minIndex=-1;
			for(int j=i;j<arr.length;j++) {
				//finding minimum ele among j position
			if(arr[j] < min) {
				min=arr[j];
				minIndex=j; 
			}
				
			}
		//	swap element at minindex with ith element
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[] = {1,3,4,5,4,8};
         selectionsort(arr);
         printarray(arr);
	}

}
