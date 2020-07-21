package pattern.bridge;

public class Bike extends Vehicle {

	public Bike(Workshop producer, Workshop assembler) {
		super(producer, assembler);
	}

	@Override
	public void manufacture() {
		System.out.print("Bike ");
		producer.work();
		assembler.work();
	}
}