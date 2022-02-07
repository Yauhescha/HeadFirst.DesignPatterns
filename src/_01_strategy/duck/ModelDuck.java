package _01_strategy.duck;

import _01_strategy.flybehavior.FlyNoWay;
import _01_strategy.quackbehavior.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Quack());
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}

}
