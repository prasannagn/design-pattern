package pattern.bridge;

public class Car extends Vehicle {

	public Car(Workshop producer, Workshop assembler) {
		super(producer, assembler);
	}

	@Override
	public void manufacture() {
		System.out.print("Car ");
		producer.work();
		assembler.work();

	}
}
