package dev.zay.example.using.interfaces;

public class InterfaceTest {
	
	public static void main(String[] args) {
		
		Vehicle car = new Car();
		
		Driver driver = new Driver(car);
		driver.driveVehicle();
	}

}
