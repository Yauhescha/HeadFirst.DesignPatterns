package _02_observer.subject;

import _02_observer.observer.Observer;
import _02_observer.observer.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private WeatherData weatherData;
	private float temp;
	private float humidity;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temp
				+ "F degrees and " + humidity +"% humidity");
		
	}

	@Override
	public void update() {
		temp = weatherData.getTemp();
		humidity = weatherData.getHumidity();
		display();
	}

}
