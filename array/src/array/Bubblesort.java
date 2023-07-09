package array;

public class Bubblesort {

	public static void printarray(int[]arr) {
		int n=arr.length;
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
	
	public static void bubblesort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			//n-1 rounds
			for(int j=0;j<n-1;j++) {
				if(arr[j]<arr[j+1]) {
					//swap
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr = {1,2,3,4,5,6,7};
     bubblesort(arr);
     printarray(arr);
	}

}
