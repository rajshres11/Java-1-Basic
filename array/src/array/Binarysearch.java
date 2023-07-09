package array;

public class Binarysearch {
    public static int binarysearch(int arr[],int x) {
    	int s=0;
    	int e=arr.length-1;
    	
    	while(s<=e) {
    		int m=(s+e)/2;
    		if(arr[m]>x) {
    			e=m-1;
    		}else if(arr[m]<x) {
    			s=m+1;
    		}else {
    			return m;
    		}
    	}
    	return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = {1,3,4,5,7,8,20};
       int index = binarysearch(arr,7);
       System.out.println("index"+ index);
	}

}
