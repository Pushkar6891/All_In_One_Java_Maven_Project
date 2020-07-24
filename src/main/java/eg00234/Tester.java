package eg00234;

public class Tester {

	public static void main(String[] args) {

		PizzaTemplate vegPizzaTemplate = new VegPizza();
		vegPizzaTemplate.preparePizza();
		
		System.out.println("=====================");
		
		PizzaTemplate nonvegPizzaTemplate = new NonVegPizza();
		nonvegPizzaTemplate.preparePizza();
		
		System.out.println("=====================");
	}
}
