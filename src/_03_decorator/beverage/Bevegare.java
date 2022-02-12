package _03_decorator.beverage;

public abstract class Bevegare {
	String description = "Unknow Beverage";

	public abstract double cost();

	public String getDescription() {
		return description;
	}
}
