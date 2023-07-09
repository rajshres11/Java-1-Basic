package classesandobject;

public class Fraction {
      
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator , int denominator)  {
		if(denominator == 0) {
			
			//throw error
			denominator =1;
		}
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	
	public void setnumerator(int num) {
		this.numerator = num;
		simplify();
	}
	
	public int getnumerator() {
		return numerator;
	}
	
	public void setdenominator(int num) throws dividebyzeroexception  {
		if(num==0) {
			throw new dividebyzeroexception();
	//		return;
		}this.denominator = num;
		simplify();
	}
	
	public int getdenominator() {
		return denominator;	}
	
	private void simplify() {
		// TODO Auto-generated method stub
		int gcd = 1;
		int smaller = Math.min(numerator, denominator);
		for(int i=2;i<=smaller;i++) {
			if(numerator%i == 0 && denominator%i == 0) {
				gcd = i;
			}
		}
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}
	
	public void increment() {
		numerator = numerator + denominator ;
		simplify();
	}

	public void print() {
		System.out.println(numerator+"/"+denominator);
	}


    public void add(Fraction f2) {
	// 1 fraction is the fraction on which func is called
	//// 2 frac is passed as arguments
	this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
    this.denominator = this.denominator * f2.denominator;
    simplify();
}
    
    public static Fraction add(Fraction f1, Fraction f2) throws dividebyzeroexception {
    	int newnum = f1.numerator*f2.denominator+f1.denominator*f2.numerator;
    	int newdeno = f1.denominator*f2.denominator;
    	Fraction f3 = new Fraction(newnum,newdeno);
    	return f3;
    }
}
