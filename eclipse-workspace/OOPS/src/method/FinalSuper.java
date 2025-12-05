package method;

class parent 
{
	String color="white";
	void add()
	{
		System.out.println("hello main");
	}
}

class child extends parent
{
final  int A=100;
	  String color="gray";
 /* void	display()
	{
		System.out.println(super.color);
	}*/
  void add()
  {
	  super.add();
	  System.out.println("hello child");
  }
}

class subchild extends child
{
	String color="red";
	void display1()
	{
		System.out.println(super.color);
	}
}
public class FinalSuper 
{
	public static void main(String[] args)
	{
		//child cs=new child();
		subchild cs=new subchild();
		//cs.display();
		cs.add();
		cs.display1();
		//cs.A=200;
		System.out.println(cs.A);
	}
}

