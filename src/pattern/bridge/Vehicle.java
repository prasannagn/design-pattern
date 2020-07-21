package pattern.bridge;

public abstract class Vehicle {
	protected Workshop producer;
	protected Workshop assembler;

	protected Vehicle(Workshop producer, Workshop assembler) {
		this.producer = producer;
		this.assembler = assembler;

	}

	abstract public void manufacture();

}
