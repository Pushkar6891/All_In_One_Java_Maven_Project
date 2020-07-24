package eg00234;

public class VegPizza extends PizzaTemplate {

	@Override
	public void selectBread() {
		System.out.println("Choossing bread for Veg Pizza");
	}

	@Override
	public void addIngredients() {
		System.out.println("Adding ingredients for Veg Pizza");
	}

}
