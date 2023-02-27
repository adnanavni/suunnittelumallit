public class Charizard extends EvolveState {

	public static final Charizard CHARIZARD = new Charizard();

	private Charizard() {
	}

	public static Charizard getInstance() {
		return CHARIZARD;
	}

	@Override
	public void move() {
		System.out.println("Charizard moves");
	}

	@Override
	public void eat() {
		System.out.println("Charizard eats");
	}

	@Override
	public void sleep() {
		System.out.println("Charizard sleeps");
	}

	@Override
	public void evolve(CharmanderChar c) {
	}

}
