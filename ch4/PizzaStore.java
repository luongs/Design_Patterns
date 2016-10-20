package ch4;

// Specific pizza stores like NY, Chicago, California stores need to implement this abstract class
public abstract class PizzaStore {

	public Pizza orderPizza(String type){
		
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		// pizza returned does not really know what concrete class implemented this
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);
}
