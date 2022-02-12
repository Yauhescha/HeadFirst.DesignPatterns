package _03_decorator.beverage;

public class HouseBlend extends Bevegare {

	public HouseBlend() {
		description = "House Blend Coffee";
	}

	@Override
	public double cost() {
		return .89;
	}

}
