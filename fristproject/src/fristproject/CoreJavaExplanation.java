package fristproject;

public class CoreJavaExplanation {   /*<acces modifier> class (ClassName)
	                                  class: wrapping or (group of) of a member varibles and member functions is called class*/
	                                           

 static	public  void main(String... a) {
		System.out.println("now we are discussing abot the methods");
		CoreJavaExplanation obj=new CoreJavaExplanation();           // creation of object
		obj.methName(); 
		obj.name(12); // calling a method
		obj.math2();
		obj.meth3(3,4);
		int res;
	}
   public void methName() {                                           //N.C---> s and C     method--> <A.M> returntype methodName.
	System.out.println("you are calling a method1");                 //
	CoreJavaExplanation obj=new CoreJavaExplanation();
	obj.methName1();
	//return 0;                           // void cannot return any thing                     
	}
   public void methName1() {                              //non perameterized method
	System.out.println("you are calling a method2");
	System.out.println("it is not a paramerised method");
	
}
   public int name(int a) {
	   System.out.println("this is a parameterised method");//if we use primitive data types as a return type we have to give a return value
	   System.out.println(a);
	   System.out.println(a+"it is anthoer way to print a variable value"+a);
	return 0;                                                                     // parametarzed method
}
   private int math2() {
	   return 0;
   }
   public int meth3(int a,float b) {
	  return 0; 
   }
   public void meth4() {
	   
   }
}
