package firstpackage;

import java.util.Scanner;

public class input {
	static Scanner reader= new Scanner(System.in);
//	static Scanner reader1= new Snanner(System.in);
	
	public static void main(String[]args) {
		System.out.print("enter name:");
		String name = reader.nextLine();
		System.out.println("enter age:");
		int age = reader.nextInt();
		System.out.println("enter salary");
		double salary =reader.nextDouble();
		System.out.println("say a quote");
		String say = reader.nextLine();
	
		
		
	}
 

}
