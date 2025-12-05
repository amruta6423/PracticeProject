
package method;

public class Encapsualtion {
	private int a;
	private int b;
	
	public int getA()
	{
		return a;
	}
	public void setA(int a)
	{
		this.a = a;
	}
	public int getB() 
	{
		return b;
	}
	public void setB(int b) 
	{
		this.b = b;
	}
	
public static void main(String[] args)
		{
	Encapsualtion en =new Encapsualtion();
			en.setA(100);
	  System.out.println(en.getA());
		}
}
