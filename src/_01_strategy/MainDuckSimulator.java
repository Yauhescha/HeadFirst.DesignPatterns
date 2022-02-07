package _01_strategy;

import _01_strategy.duck.Duck;
import _01_strategy.duck.MallardDuck;
import _01_strategy.duck.ModelDuck;
import _01_strategy.flybehavior.FlyRocketPower;

public class MainDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();

		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPower());
		model.performFly();

	}
}
