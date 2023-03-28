import java.util.Random;

public class StateChangeVisitor implements Visitor {
	@Override
	public void visit(StateA stateA) {
		Random rand = new Random();
		boolean shouldChange = rand.nextBoolean();

		if (shouldChange) {
			System.out.println("StateA is changing to StateB...");
			stateA.context.setState(new StateB(stateA.context));
		} else {
			System.out.println("StateA is continuing...");
		}
	}

	@Override
	public void visit(StateB stateB) {
		Random rand = new Random();
		boolean shouldChange = rand.nextBoolean();

		if (shouldChange) {
			System.out.println("StateB is changing to StateA...");
			stateB.context.setState(new StateA(stateB.context));
		} else {
			System.out.println("StateB is continuing...");
		}
	}
}