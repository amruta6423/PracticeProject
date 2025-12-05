package method;

public class Encapsulation {
	
	private int a;
	private int b;
	 
	
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Encapsulation en  =new Encapsulation();
	
		en.setA(100);
		System.out.println(en.getA());
	}

}

