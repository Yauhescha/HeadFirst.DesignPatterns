package _03_decorator.beverage;

public class Decaf extends Bevegare {

	public Decaf() {
		description = "Decaf";
	}

	@Override
	public double cost() {
		return 1.05;
	}

}