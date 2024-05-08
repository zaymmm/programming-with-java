package dev.zay.example.using.interfaces;

public class Driver {

	private Vehicle vehicle;

	public Driver(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void driveVehicle() {
		vehicle.start();
		vehicle.drive();
		vehicle.stop();
	}

}
