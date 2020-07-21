package pattern.adapter;

public class TurkeyAdapter implements Duck {
	private Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void fly() {
		turkey.fly();

	}

	@Override
	public void quack() {
		turkey.gobble();
	}

}
