package _03_decorator.condiment;

import _03_decorator.beverage.Bevegare;

public abstract class CondimentDecorator extends Bevegare {
	Bevegare bevegare;

	public abstract String getDescription();

}
