package array;

public class Primitiveandnonprimitive {
    
	public static void increment(int i) {
		i++;
	}
	public static void printArray(int [] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
	}
	public static int[] incrementarray(int[] input) {
	//public static void incrementarray(int[] input) 
		input = new int[7];
		for(int i=0;i<input.length;i++) {
			input[i]=input[i]+1;
		}
		return input;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	//	int i= 10;
	//	 increment(i);
	//	System.out.println(i);
		
		 int [] arr= {1,2,3,4,5};
		 incrementarray(arr);
		 printArray(arr);
	}

}
