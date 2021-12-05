package firstpackage;

import java.sql.Date;
import java.util.Scanner;
import java.util.Calendar;


public class MyAgeCon {
	
	static Scanner reader= new Scanner(System.in);
    
	public static void main(String [] args)
	{
		System.out.println("enter DOB:");
		int DOB=reader.nextInt();
		int year= Calendar.getInstance().get(Calendar.YEAR);
		int age = year-DOB;
		System.out.println("your age("+age+")years");
		
	}
}
