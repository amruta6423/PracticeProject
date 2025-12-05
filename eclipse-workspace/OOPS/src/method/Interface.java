package method;

public interface Interface {
	
	 final int z=100;
	
	void a();
	
	static void b()
	{
		System.out.println("static method");
	}
	
   default void c()
   {
	   System.out.println("default method");
   }
 public class ABC implements Interface
	{
		public void a()
		{
					System.out.println("hello");
		}
	}
	
	public static void main(String[] args)
	{
		
       ABC obj= new ABC();
       obj.c();
       obj.a();
       b();
    
       
	}

}
