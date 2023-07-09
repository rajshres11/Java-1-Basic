package array;

import java.util.Scanner;

public class Largestelement {
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
	public static int largest(int arr[]) {
		int max=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]> max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr=takeinput();
         int lar= largest(arr);
         System.out.println(lar);
         
	}

}
