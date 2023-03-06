
import java.util.List;
import java.util.ListIterator;

public class NewLineAfterEveryItem implements ListConverterStrategy {

	@Override
	public String listToString(List<?> list) {
		StringBuilder builder = new StringBuilder();
		ListIterator<?> iterator = list.listIterator();

		while (iterator.hasNext()) {
			builder.append(iterator.next().toString());
			builder.append("\n");
		}

		return builder.toString();
	}
}