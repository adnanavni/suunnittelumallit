public interface State {
	void handle();

	void accept(Visitor visitor);
}