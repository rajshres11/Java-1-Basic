package array;
import java.util.Scanner;
public class Inputofarray {
    
	public static void printArray( int[]arr) {
		 int n=arr.length;
	      for( int i=0;i<n;i++) {
	      	 System.out.println(arr[i]);
	}
	}
	
	
	
	public static int[] takeinput(){
		Scanner s= new Scanner(System.in);
	      int n=s.nextInt();
	      int[] arr= new int[n];
	      
	      for( int i=0;i<n;i++) {
	      	 System.out.println("enter element at" + i);
	      	  arr[i]=s.nextInt();
	      	  
	        }
	      return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr=takeinput();
		 printArray(arr);
		
		
     // Scanner s= new Scanner(System.in);
    //  int n=s.nextInt();
     // int[] arr= new int[n];
      
     // for( int i=0;i<n;i++) {
    	//  System.out.println("enter element at" + i);
    	 // arr[i]=s.nextInt();
    	  
   //   }
     // for(int i=0;i<n;i++) {
    	//  System.out.println(arr[i]);
   //   }
      
	}

}
