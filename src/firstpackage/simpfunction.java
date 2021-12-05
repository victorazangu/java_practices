package firstpackage;

public class simpfunction {
	
	float sum(float n1,float n2) {
		float sum=n1+n2;
		return sum;
	}
	
	void Draw() {
		for(int i=0;i<7;i++) {
			System.out.println("count:"+i);
			}
	}

	public static void main(String[]args) {
		// TODO Auto-generated constructor stub
		new simpfunction().Draw();
		float r=new simpfunction().sum(3,9);
		System.out.println("sum ="+r);
		 
	}
	
}
