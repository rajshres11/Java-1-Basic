package array;

public class Printallpairs {
     
	public static void printallpairs(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.println(arr[i]+" "+ arr[j]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,4,5,6};
      printallpairs(arr);
	}

}
