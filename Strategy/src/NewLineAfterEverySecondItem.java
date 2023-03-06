import java.util.List;

public class NewLineAfterEverySecondItem implements ListConverterStrategy {

	@Override
	public String listToString(List<?> list) {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < list.size(); i += 2) {
			builder.append(list.get(i).toString());
			builder.append("\n");
		}

		return builder.toString();
	}
}