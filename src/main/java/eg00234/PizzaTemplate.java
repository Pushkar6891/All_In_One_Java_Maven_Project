package eg00234;

public abstract class PizzaTemplate {

	public final void preparePizza() {
		selectBread();
		addIngredients();
		cookPizza();
		addCheese();
		addToppings();
	}

	public abstract void selectBread();

	public abstract void addIngredients();

	public void cookPizza() {
		System.out.println("Cooking pizza for 30 minutes");
	}

	public void addCheese() {
		System.out.println("Adding Cheese in Pizza");
	}
	
	public void addToppings() {
		System.out.println("Adding Toppings in Pizza");
	}
}
