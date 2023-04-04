import java.util.ArrayList;

public class HesburgerBuilder implements BurgerBuilder {
	private ArrayList<String> parts = new ArrayList<String>();

	@Override
	public void addBun() {
		parts.add("Hesburger Bun");
	}

	@Override
	public void addPatty() {
		parts.add("Beef Patty");
	}

	@Override
	public void addCheese() {
		parts.add("Cheddar Cheese");
	}

	@Override
	public void addLettuce() {
		parts.add("Iceberg Lettuce");
	}

	@Override
	public void addTomato() {
		parts.add("Sliced Tomato");
	}

	@Override
	public void addSauce() {
		parts.add("Ketchup and Mustard");
	}

	@Override
	public Burger getBurger() {
		return new Burger(parts);
	}
}
