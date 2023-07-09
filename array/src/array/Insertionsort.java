package array;

public class Insertionsort {

	public static void printarray(int[]arr) {
		int n=arr.length;
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);	
	}
	public static void insertionsort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int j=i-1;
			int temp=arr[i];
			while(j>=0&&arr[j]>temp) {
				arr[j+1]=arr[j];
				
				j--;
			}
			arr[j+1]=temp;
		}
	}
	public static void main (String[] args) {
		
		int arr[] = {9,4,3,5,6};
		insertionsort(arr);
		printarray(arr);
	}
	
}
