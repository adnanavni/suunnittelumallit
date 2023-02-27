
public class CharmanderChar {

	private EvolveState state;

	public CharmanderChar() {
		state = Charmander.getInstance();
	}

	public void move() {
		state.move();
	}

	public void eat() {
		state.eat();
	}

	public void sleep() {
		state.sleep();
	}

	protected void evolve() {
		state.evolve(this);
	}

	protected void switchState(EvolveState k) {
		state = k;
	}

}