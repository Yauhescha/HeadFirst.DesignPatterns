package _02_observer;

import _02_observer.observer.WeatherData;
import _02_observer.subject.CurrentConditionsDisplay;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		
		CurrentConditionsDisplay display = new CurrentConditionsDisplay(data);
		data.registerObserver(display);
		
		data.measurementsChanged(80, 65, 30.4f);
		data.measurementsChanged(82, 70, 29.2f);
		data.measurementsChanged(78, 90, 29.2f);
	}

}
