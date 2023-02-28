import java.util.HashMap;
import java.util.Random;

public class ThrowTheDice extends Game {

	private static String winner;

	private boolean win;

	@Override
	void initializeGame() {
		System.out.println(playersCount + " pelaajaa heittävät kerran noppaa");
		System.out.println("Suurimman nopan heittänyt voittaa!");
	}

	@Override
	void makePlay(int player) {
		HashMap<String, Integer> pelaajat = new HashMap<>();

		for (int i = 1; i <= playersCount; i++) {
			Random random = new Random();
			int randomNumber = random.nextInt(6) + 1;

			pelaajat.put("" + i, randomNumber);
		}

		String maxKey = null;
		int maxValue = Integer.MIN_VALUE;
		for (HashMap.Entry<String, Integer> entry : pelaajat.entrySet()) {
			if (entry.getValue() > maxValue) {
				maxValue = entry.getValue();
				maxKey = entry.getKey();
			}

			winner = maxKey;

			win = true;
		}
	}

	@Override
	boolean endOfGame() {

		if (win) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	void printWinner() {
		System.out.println("Voittaja on: " + winner + ". Onnea voittajalle!");
	}

}
