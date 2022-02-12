package _03_decorator.condiment;

import _03_decorator.beverage.Bevegare;

public class Soy extends CondimentDecorator {

	public Soy(Bevegare bevegare) {
		this.bevegare = bevegare;
	}

	@Override
	public String getDescription() {
		return bevegare.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return bevegare.cost() + .15;
	}

}
