package pattern.observer;

public class ForcastDisplay implements Observer {

	WeatherData weatherData;

	public ForcastDisplay(Subject weatherData) {
		this.weatherData = (WeatherData) weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update() {
		System.out.println("--ForcastDisplay--");
		System.out.println("temperature:" + weatherData.getTemperature());
		System.out.println("humidity:" + weatherData.getHumidity());
		System.out.println("pressure:" + weatherData.getPressure());
		System.out.println("---------------");
	}

}