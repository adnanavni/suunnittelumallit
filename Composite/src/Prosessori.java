
public class Prosessori implements Laiteosa {

	@Override
	public double getHinta() {
		return 200;
	}

	@Override
	public void lisaaOsa(Laiteosa osa) {
		throw new RuntimeException("Muistipiiriin ei voi lisätä osia.");
	}

}
