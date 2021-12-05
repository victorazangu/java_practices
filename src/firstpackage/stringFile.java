package firstpackage;

public class stringFile {

	public static void main(String[]args) {
		// TODO Auto-generated constructor stub
		String name = "victor azangu";
		//prints length
		System.out.println(name.length());
		//prints first char
		System.out.println("first char:"+ name.charAt(0));
		//prints the last char
		System.out.println("last char:" +name.charAt(-1));
		System.out.println("print char:");

		//print all char
		for(int i =0;i<name.length();i++) {
			System.out.println(name.charAt(i));
		}
	}

}
