package _03_decorator.condiment;

import _03_decorator.beverage.Bevegare;

public class Mocha extends CondimentDecorator {

	public Mocha(Bevegare bevegare) {
		this.bevegare = bevegare;
	}

	@Override
	public String getDescription() {
		return bevegare.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return bevegare.cost() + .20;
	}

}
