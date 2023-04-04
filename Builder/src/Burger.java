
public class Burger {
	private Object burgerParts;

	public Burger(Object parts) {
		burgerParts = parts;
	}

	@Override
	public String toString() {
		return burgerParts.toString();
	}
}