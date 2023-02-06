import java.util.ArrayList;

public class Emolevy implements Laiteosa {

	private ArrayList<Laiteosa> lista = new ArrayList<>();

	@Override
	public double getHinta() {
		return lista.stream().mapToDouble(o -> o.getHinta()).sum() + 100;
	}

	@Override
	public void lisaaOsa(Laiteosa osa) {
		lista.add(osa);
	}

}
