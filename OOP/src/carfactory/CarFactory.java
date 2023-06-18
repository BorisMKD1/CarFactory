package carfactory;

public class CarFactory {
	
	public static void main(String[] args) {
		
	
	Car c1 = new Car("blue", "Mercedes");
	Car c2 = new Car("black", "BMW");
	c1.display();
	c2.display();
	}

}
