package pattern.singleton;

public class Singleton {

	private static volatile Singleton uniqueInstance;

	private Singleton() {
	}

	public static Singleton getInstance() {

		if (null == uniqueInstance) {
			synchronized (Singleton.class) {
				if (null == uniqueInstance) {
					uniqueInstance = new Singleton();
				}
			}
		}

		return uniqueInstance;

	}
}
