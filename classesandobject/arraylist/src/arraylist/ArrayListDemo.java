package arraylist;

import java.util.ArrayList;

public class ArrayListDemo{

    public static void main(String[] args){
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(1,80);

        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        // enhanced for loop 
        for(int i:arr){
          System.out.println(i);
        }

    }
}
