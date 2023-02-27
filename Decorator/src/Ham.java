public class Ham extends PizzaDecorator {

	public Ham(IPizza pizzaToBeDecorated) {
		super(pizzaToBeDecorated);
	}

	@Override
	public double getPrice() {
		return super.getPrice() + 2.0;
	}

	@Override
	public String getDescription() {
		return super.getDescription() + " Ham,";
	}

}