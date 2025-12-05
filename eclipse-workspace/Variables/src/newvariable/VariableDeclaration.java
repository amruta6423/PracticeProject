package newvariable;

public class VariableDeclaration {


	  int id;
	  String name;
	  
	  public VariableDeclaration(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	  void m2()
	  {
		  System.out.println(id +"  "+ name);
	  }
	  
	  void printdata(int eid, String ename)
	  {
		id=eid;
		name=ename;
	  }
 
	  
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
              
		VariableDeclaration obj= new VariableDeclaration(101,"amruta");
		obj.m2();
		//obj.m2();
		//obj.id=1;
		//obj.name="amruta";
		//obj.m2();
		obj.printdata(1, "amruta");
		obj.printdata(2, "amruta");
		obj.m2();
	}

}
