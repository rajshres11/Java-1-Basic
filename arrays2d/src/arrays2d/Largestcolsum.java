package arrays2d;
import java.util.Scanner;
public class Largestcolsum {
		public static int[][] takeInput(){
			
		    Scanner s = new Scanner(System.in);
		       System.out.println("Enter the no of rows");
		       int row=s.nextInt();
		       System.out.println("Enter the no of col");
		       int col=s.nextInt();
		       int[][] arr=new int[row][col];
		       
		     for(int i=0;i<row;i++) {
		  	   for(int j=0;j<col;j++) {
		  		   System.out.println("enter the element"+ i + j);
		  		   arr[i][j]=s.nextInt();
		  		
		  	   }
		       }
		      return arr;
		    		 
		}
         public static int largestcol(int[][]arr) {
        	int row = arr.length;
        	int col = arr[0].length;
        	int largest = Integer.MIN_VALUE;
        	for(int j=0;j<=col;j++) {
        		int sum=0;
        		for(int i=0;i<row;i++){
        			sum= sum + arr[i][j];
        		}
        		if(sum>largest) {
        			largest = sum;
        		}
        	}
        	return largest;
         }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		  
		  		int[][]arr = takeInput();
		  	
		  	   int larcolsum  = largestcol(arr);
		       System.out.println(larcolsum);
		}
}

