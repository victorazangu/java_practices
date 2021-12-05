package firstpackage;

import java.util.Scanner;

public class SimpleIF {
	static Scanner reader = new Scanner(System.in);
	public static void main(String []args) {
		System.out.println("Enter grade:");
		int grade = reader.nextInt();
		
		if(grade >=80)
		{
			System.out.println("it is an A");
		}
		else {
			System.out.println("you failed");
		}
		
	}

}
