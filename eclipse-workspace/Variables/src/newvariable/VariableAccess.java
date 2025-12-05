package newvariable;

public class VariableAccess { 
	int a=10;    //instance variable
	static int b=20;  //static variable
	 void m()
	{
		int c=100;  //local variable
		System.out.println("the value of local variable is"+ c);
		System.out.println("the value of static variable in NONSTATIC method is" +b);
		System.out.println("the value of instance variable in NONSTATIC method is" +a);
	}
	static void m1()
	{     
		String name="static method";
	//System.out.println("the value of local variable is"+ c);
		//local variable accesible only within that method in which it declared
	//System.out.println("the value of instance variable in NONSTATIC method is" +a);
	//we cannot access instance variable inside static method
	System.out.println("the value of static variable in STATIC method" +b);
	System.out.println(name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        VariableAccess t1= new VariableAccess();
        t1.m();
        m1();
	} 

}
