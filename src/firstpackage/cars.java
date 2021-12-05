package firstpackage;

public class cars {
	String Type;
	int Model;
	double Price;
	double Milliage;
	
	double GetPrice() {
		double NewPrice = Price-(Milliage*100);
		return NewPrice;
	}
	

	
}
