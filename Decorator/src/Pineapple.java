public class Pineapple extends PizzaDecorator {

	public Pineapple(IPizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}

	@Override
	public double getPrice() {
		return super.getPrice() + 1.0;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " Pineapple,";
	}

}