package classesandobject;

public class Fractionuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Fraction f1;
		f1 = new Fraction(4,6);
        f1.print();
    //    f1.setnumerator(12);
 //       f1.increment();
   //      f1.print();
        
        Fraction f2 = new Fraction(4,8); 
       f1.add(f2);
	    f1.print();
        
        Fraction f3 = Fraction.add(f1,f2);
        f3.print();
	}

}
