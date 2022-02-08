package _02_observer.observer;

import java.util.ArrayList;
import java.util.List;

import _02_observer.subject.Subject;

public class WeatherData implements Subject{
	private float temp;
	private float humidity;
	private float pressure;
	private List<Observer> observers = new ArrayList<>();
	
	
	
	public void measurementsChanged(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObserver();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);		
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for (Observer ob: observers) {
			ob.update();
		}
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
}
