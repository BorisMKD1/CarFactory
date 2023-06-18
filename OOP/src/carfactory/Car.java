package carfactory;

public class Car {
	
	String color;
	String model;
	
	Car(String color, String model){
		this.color = color;
		this.model = model;
	}
	
	void display() {
		System.out.println("Car color: " + color + " Car model: " + model);
	}

}
