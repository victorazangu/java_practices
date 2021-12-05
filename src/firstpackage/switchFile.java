package firstpackage;

import java.util.Scanner;

public class switchFile {
	static Scanner reader = new Scanner(System.in);
	public static void main(String []args) {
		System.out.println("enter index");
	 int index = reader.nextInt();
	 switch(index) {
	 case 1:
		 System.out.println("he is a male");
		 break;
	 case 22:
		 System.out.println("she is female");
	     break;
	 default:
		 System.out.println("other");
		 break;
	 }
	}
}
