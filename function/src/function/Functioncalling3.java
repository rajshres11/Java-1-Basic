package function;

public class Functioncalling3 {

		public static int sum(int a,int b){
		    int result=a+b;
		    return result;
		}
		public static int increment(int n){
		    n++;
		    //System.out.println("Increment "+n);
		    return n;
		}
		    
		public static void main(String args[]) {
		    int n=10;
		    n=increment(n);
		    System.out.println(" Main "+n);
		    }

}
