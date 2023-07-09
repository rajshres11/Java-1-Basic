package arrays2d;

import java.util.Scanner;

public class Functionwith2darray {
    public static void print2darray(int[][] arr) {
    	int row = arr.length;
    	int col = arr[0].length;
    	for(int i=0;i<row;i++) {
	    	  for(int j=0;j<col;j++) {
	    		   System.out.print(arr[i][j]+"");
	    	  }
	    	  System.out.println();
    	}
    }
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
	  		int[][] input = takeInput();
	  		print2darray(input);
	  	   
	       
	   }
	}


