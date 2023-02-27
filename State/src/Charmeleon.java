
public class Charmeleon extends EvolveState {

	public static final Charmeleon CHARMELEON = new Charmeleon();

	private Charmeleon() {
	}

	public static Charmeleon getInstance() {
		return CHARMELEON;
	}

	@Override
	public void move() {
		System.out.println("Charmeleon moves");
	}

	@Override
	public void eat() {
		System.out.println("Charmeleon eats");
	}

	@Override
	public void sleep() {
		System.out.println("Charmeleon sleeps");
	}

	@Override
	public void evolve(CharmanderChar c) {
		switchState(c, Charizard.getInstance());
	}

}
