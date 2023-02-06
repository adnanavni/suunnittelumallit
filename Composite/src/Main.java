
public class Main {

	public static void main(String[] args) {

		Laiteosa kotelo = new Kotelo();
		Laiteosa emo = new Emolevy();
		Laiteosa ram = new Muistipiiri();
		Laiteosa gpu = new Näytönohjain();
		Laiteosa cpu = new Prosessori();
		Laiteosa verkkokortti = new Verkkokortti();

		kotelo.lisaaOsa(emo);
		emo.lisaaOsa(ram);
		emo.lisaaOsa(gpu);
		emo.lisaaOsa(cpu);
		emo.lisaaOsa(verkkokortti);

		System.out.println(kotelo.getHinta());
		System.out.println(emo.getHinta());
		System.out.println(cpu.getHinta());
	}

}
