public class Viisari implements Cloneable {
	private int arvo;
	private int maksimi;

	public Viisari(int maksimi) {
		this.maksimi = maksimi;
	}

	public void asetaArvo(int arvo) {
		this.arvo = arvo;
	}

	public void etene() {
		arvo = (arvo + 1) % maksimi;
	}

	public int getArvo() {
		return arvo;
	}

	@Override
	public Viisari clone() throws CloneNotSupportedException {
		return (Viisari) super.clone();
	}
}
