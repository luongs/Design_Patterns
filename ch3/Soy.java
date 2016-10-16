package ch3;

public class Soy extends CondimentDecorator{
	
	Beverage bevarage;
	
	public Soy (Beverage bevarage){
		this.bevarage = bevarage;
	}
	
	public String getDescription() {
		return bevarage.getDescription() + ", Soy";
	}
	
	public double cost() {
		return bevarage.cost() + 0.15;
	}

}
