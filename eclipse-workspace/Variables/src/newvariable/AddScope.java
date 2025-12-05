package newvariable;

public class AddScope {
	
	int a=100;   //instance variable
	static int b; //static variable
	
	void m2()
	{
	 int c=300;
	 int d= c+a;   //addition of local and instance variable
	 System.out.println("the addition is"+ d);
	 int num= a + b; //addition of instance and static variable
	 System.out.println(num);
	}
   

public static void main(String args[])
{
	AddScope t2= new AddScope();
	t2.m2();
}
}