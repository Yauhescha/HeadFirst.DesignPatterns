package _03_decorator;

import _03_decorator.beverage.Bevegare;
import _03_decorator.beverage.DarkRoast;
import _03_decorator.beverage.Espresso;
import _03_decorator.beverage.HouseBlend;
import _03_decorator.condiment.Mocha;
import _03_decorator.condiment.Soy;
import _03_decorator.condiment.Whip;

public class StarbuzzCoffee {
	public static void main(String[] args) {
		Bevegare bevegare = new Espresso();
		System.out.println(bevegare.getDescription() + " $" + bevegare.cost());

		Bevegare bevegare2 = new DarkRoast();
		bevegare2 = new Mocha(bevegare2);
		bevegare2 = new Mocha(bevegare2);
		bevegare2 = new Whip(bevegare2);
		System.out.println(bevegare2.getDescription() + " $" + bevegare2.cost());

		Bevegare bevegare3 = new HouseBlend();
		bevegare3 = new Soy(bevegare3);
		bevegare3 = new Mocha(bevegare3);
		bevegare3 = new Whip(bevegare3);
		System.out.println(bevegare3.getDescription() + " $" + bevegare3.cost());
	}
}
