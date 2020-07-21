package pattern.observer;

public class CurrentConditionDisplay implements Observer{

	WeatherData weatherData;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = (WeatherData) weatherData;
		weatherData.registerObserver(this);
	}
	@Override
	public void update() {
		System.out.println("--CurrentConditionDisplay--");
		System.out.println("temperature:" + weatherData.getTemperature());
		System.out.println("humidity:" + weatherData.getHumidity());
		System.out.println("pressure:" + weatherData.getPressure());
		System.out.println("---------------");
	}
	
}