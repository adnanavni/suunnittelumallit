public class Context {
	private State currentState;

	public Context() {
		currentState = new StateA(this);
	}

	public void setState(State state) {
		currentState = state;
	}

	public void request() {
		currentState.handle();
	}

	public void accept(Visitor visitor) {
		currentState.accept(visitor);
	}
}