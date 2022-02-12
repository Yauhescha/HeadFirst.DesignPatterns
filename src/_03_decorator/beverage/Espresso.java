package _03_decorator.beverage;

public class Espresso extends Bevegare {

	public Espresso() {
		description = "Espresso";
	}

	@Override
	public double cost() {
		return 1.99;
	}

}
