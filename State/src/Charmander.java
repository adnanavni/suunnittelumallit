
public class Charmander extends EvolveState {

	public static final Charmander CHARMANDER = new Charmander();

	private Charmander() {
	}

	public static Charmander getInstance() {
		return CHARMANDER;
	}

	@Override
	public void move() {
		System.out.println("Charmander moves");
	}

	@Override
	public void eat() {
		System.out.println("Charmander eats");
	}

	@Override
	public void sleep() {
		System.out.println("Charmander sleeps");
	}

	@Override
	public void evolve(CharmanderChar c) {
		switchState(c, Charmeleon.getInstance());
	}

}
