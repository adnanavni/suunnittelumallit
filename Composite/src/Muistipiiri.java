
public class Muistipiiri implements Laiteosa {

	@Override
	public double getHinta() {
		return 100;
	}

	@Override
	public void lisaaOsa(Laiteosa osa) {
		throw new RuntimeException("Muistipiiriin ei voi lisätä osia.");

	}

}
