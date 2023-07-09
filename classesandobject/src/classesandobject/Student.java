package classesandobject;

public class Student {
 public  String name;   //only public use other package
 private  int rollnumber;   
 int id;// in same packae
 double cgpa;
// final  double conversionfactor = 0.95;
 final static double CONVERSIONFACTOR = 0.95;
 private static int numStudents;
  
  public Student(String name) {
	  this.name = name;
	  numStudents++;
	  this.rollnumber = numStudents;
  }
  
  
// public Student(String n , int num) {
//	 name = n;
//	 	 rollnumber = num;
	 
 //}
 // public Student(String n) {
//	  name = n;
 // }
  
  public static int getnumStudents() {
	  return numStudents;
  }
  
  
  
  
//  public void print(){
//	  System.out.println(name+" "+rollnumber);
//  }
 
   public int getrollnumber() {
	   return rollnumber;
   }
  public void setrollnumber(int rollnumber) {
	   if(rollnumber<=0)
	   { return;
	   } this.rollnumber = rollnumber;
	  }
   }
   
//public void setrollnumber(int num) {
//	   if(num<=0)
//	   { return;
//	   } rollnumber = num;
	//   }
 
   
