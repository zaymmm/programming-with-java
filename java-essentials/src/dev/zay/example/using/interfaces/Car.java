package dev.zay.example.using.interfaces;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car started");
	}

	@Override
	public void drive() {
		System.out.println("Car is being driven");
	}

	@Override
	public void stop() {
		System.out.println("Car stopped");
	}
	
	public void park() {
        System.out.println("Car parked");
    }

}
