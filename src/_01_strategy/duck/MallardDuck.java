package _01_strategy.duck;

import _01_strategy.flybehavior.FlyWithWings;
import _01_strategy.quackbehavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}

	@Override
	public void display() {
		System.out.println("I'm a real Mallar duck");
	}

}
