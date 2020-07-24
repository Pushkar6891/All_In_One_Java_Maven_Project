package eg00234;

public class NonVegPizza extends PizzaTemplate {

	@Override
	public void selectBread() {
		System.out.println("Choossing bread for Non-Veg Pizza");
	}

	@Override
	public void addIngredients() {
		System.out.println("Adding ingredients for Non-Veg Pizza");
	}

}
