
public class PizzaDecorator implements IPizza {

	private IPizza pizzaToBeDecorated;

	public PizzaDecorator(IPizza pizzaToBeDecorated) {
		this.pizzaToBeDecorated = pizzaToBeDecorated;
	}

	@Override
	public double getPrice() {
		return pizzaToBeDecorated.getPrice();
	}

	@Override
	public String getDescription() {
		return pizzaToBeDecorated.getDescription();
	}

}
