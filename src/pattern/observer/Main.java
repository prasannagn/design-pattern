package pattern.observer;

public class Main {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		new CurrentConditionDisplay(weatherData);
		new ForcastDisplay(weatherData);
		weatherData.setMeasuremets(23, 50, 60);
		weatherData.setMeasuremets(25, 52, 67);
		weatherData.setMeasuremets(22, 49, 50);
	}
}

interface Observer {
	void update();
}

interface Subject {
	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObservers();
}