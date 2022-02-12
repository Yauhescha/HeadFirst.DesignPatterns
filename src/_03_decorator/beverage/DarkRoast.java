package _03_decorator.beverage;

public class DarkRoast extends Bevegare {

	public DarkRoast() {
		description = "DarkRoast";
	}

	@Override
	public double cost() {
		return .99;
	}

}