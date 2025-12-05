package method;

public class MethodDeclare {
// diifrent ways to create method
	//1. No parameters No return value
	int a;
	void print()
	{  
	
		System.out.println(a);
	}
	
	//2. parameters no return value
	
	void print1(int a)
	{
		this.a=a;
		System.out.println(a);
	}
	
	//3. No parameters return value
	
	int print2()
	{
		return (a);
	}
	
	//4 parameters and return value
	int print3(int a)
	{
		return(a);
	}
	public static void main(String[] args) {
	MethodDeclare md=new MethodDeclare();
	md.a=100;
	md.print();
	md.print1(10);
    System.out.println(md.print2());
    System.out.println(md.print3(200));
	}
}
	
