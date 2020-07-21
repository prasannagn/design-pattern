package pattern.observer.test;

import pattern.observer.impl.CurrentConditionDisplay;
import pattern.observer.impl.ForcastDisplay;
import pattern.observer.impl.WeatherData;

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
