package classesandobject;

public class Dyanmicarray {
     
	private int data[];
	private int nextelementindex;
	
	public Dyanmicarray() {
		data = new int[5];
		nextelementindex = 0;
	}
	
	public int size() {
		return nextelementindex;
	}
	
	public boolean isEmpty() {
		return nextelementindex == 0;
	}
	
	public int get(int i) {
		if(i>=nextelementindex) {
			return -1;//return error
		}
		return data[i];
	}
	
	public void set(int i, int elem) {
		if(i>=nextelementindex) {
			return;//error
		}data[i] = elem;
	}
	
	public void add(int elem) {
		
		if(nextelementindex == data.length) {
			doubleCapacity();
		}
		data[nextelementindex]= elem;
		nextelementindex++;
	}
    
	
	public int removeLast() {
		if(nextelementindex == 0) {
			return -1;
			
		}
		int temp = data[nextelementindex - 1];
		data[nextelementindex - 1]= 0;
		nextelementindex--;
		return temp;
	}
	private void doubleCapacity() {
		// TODO Auto-generated method stub
		int temp[] = data;
		data = new int[2*temp.length];
		for(int i = 0;i<temp.length;i++) {
			data[i]=temp[i];
		}
	}
}
