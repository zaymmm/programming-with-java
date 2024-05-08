package dev.zay.example.without.using.interfaces;


/*
In this example, the Driver class directly instantiates a Car object within its constructor, establishing a tight coupling between the Driver and Car classes. 
The Driver class relies explicitly on the Car class, and any changes to the Car class implementation may require corresponding changes to the Driver class.
*/
public class Driver {

	private Car car;

	public Driver() {
		this.car = new Car(); // Tight coupling
	}

	public void driveCar() {
		car.start();
		car.drive();
		car.stop();
		
		// New method call
		car.park();
	}
	
}
