package _03_decorator.condiment;

import _03_decorator.beverage.Bevegare;

public class Whip extends CondimentDecorator {

	public Whip(Bevegare bevegare) {
		this.bevegare = bevegare;
	}

	@Override
	public String getDescription() {
		return bevegare.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		return bevegare.cost() + .10;
	}

}
