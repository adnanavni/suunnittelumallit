
public class Verkkokortti implements Laiteosa {

	@Override
	public double getHinta() {
		return 20;
	}

	@Override
	public void lisaaOsa(Laiteosa osa) {
		throw new RuntimeException("Muistipiiriin ei voi lisätä osia.");
	}

}
