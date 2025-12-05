package scannerclass;

import java.util.Scanner;

public class ScannerIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner obj = new Scanner(System.in);
          
		 System.out.println("Enter First Name");
		 
		 String name =obj.nextLine();
		 
		 System.out.println("Name is:" +name);
	}

}
