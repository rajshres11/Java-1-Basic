package arrays2d;
import java.util.Scanner;
public class Inputarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
       for(int i=0;i<row;i++) {
    	  for(int j=0;j<col;j++) {
    		   System.out.print(arr[i][j]+"");
	}
  System.out.println();
}}
}
	
