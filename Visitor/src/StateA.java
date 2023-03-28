public class StateA implements State {
	Context context;

	public StateA(Context context) {
		this.context = context;
	}

	@Override
	public void handle() {
		System.out.println("State A handling...");
		context.accept(new StateChangeVisitor());
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
