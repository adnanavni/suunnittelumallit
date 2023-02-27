
public abstract class EvolveState {

	void move() {
	}

	void eat() {
	}

	void sleep() {
	}

	void evolve(CharmanderChar c) {
	}

	void switchState(CharmanderChar c, EvolveState s) {
		c.switchState(s);
	}
}
