public class StateB implements State {
	Context context;

	public StateB(Context context) {
		this.context = context;
	}

	@Override
	public void handle() {
		System.out.println("State B handling...");
		context.accept(new StateChangeVisitor());
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}