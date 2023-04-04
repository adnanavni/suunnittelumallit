
public class McDonaldsBuilder implements BurgerBuilder {
	private StringBuilder burger = new StringBuilder();

	@Override
	public void addBun() {
		burger.append("McDonald's Bun\n");
	}

	@Override
	public void addPatty() {
		burger.append("Beef Patty\n");
	}

	@Override
	public void addCheese() {
		burger.append("American Cheese\n");
	}

	@Override
	public void addLettuce() {
		burger.append("Shredded Lettuce\n");
	}

	@Override
	public void addTomato() {
		burger.append("Tomato Slice\n");
	}

	@Override
	public void addSauce() {
		burger.append("Special Sauce\n");
	}

	@Override
	public Burger getBurger() {
		return new Burger(burger.toString());
	}
}