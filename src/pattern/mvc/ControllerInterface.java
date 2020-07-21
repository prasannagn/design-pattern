package pattern.mvc;

public interface ControllerInterface {
	void start();
	void stop();
	void increase();
	void decrease();
	void setBPM(int bpm);
}
