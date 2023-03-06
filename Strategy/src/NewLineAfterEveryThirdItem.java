import java.util.List;

public class NewLineAfterEveryThirdItem implements ListConverterStrategy {

	@Override
	public String listToString(List<?> list) {
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < list.size(); i += 3) {
			builder.append(list.get(i).toString());
			builder.append("\n");
		}

		return builder.toString();
	}
}