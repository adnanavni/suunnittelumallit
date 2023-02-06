
public class Näytönohjain implements Laiteosa {

	@Override
	public double getHinta() {
		return 1000;
	}

	@Override
	public void lisaaOsa(Laiteosa osa) {
		throw new RuntimeException("Muistipiiriin ei voi lisätä osia.");
	}

}
