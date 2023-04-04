
public class BurgerDirector {
	private BurgerBuilder builder;

	public BurgerDirector(BurgerBuilder builder) {
		this.builder = builder;
	}

	public void makeBurger() {
		builder.addBun();
		builder.addPatty();
		builder.addCheese();
		builder.addLettuce();
		builder.addTomato();
		builder.addSauce();
	}

	public Burger getBurger() {
		return builder.getBurger();
	}
}
