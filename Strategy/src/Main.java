import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		ListConverterStrategy everyItemStrategy = new NewLineAfterEveryItem();

		System.out.println(everyItemStrategy.listToString(list));

		ListConverterStrategy everySecondItemStrategy = new NewLineAfterEverySecondItem();

		System.out.println(everySecondItemStrategy.listToString(list));

		ListConverterStrategy everyThirdItemStrategy = new NewLineAfterEveryThirdItem();

		System.out.println(everyThirdItemStrategy.listToString(list));
	}
}