public class Kello implements Cloneable {
	private Viisari tunnit;
	private Viisari minuutit;
	private Viisari sekunnit;

	public Kello() {
		tunnit = new Viisari(24);
		minuutit = new Viisari(60);
		sekunnit = new Viisari(60);
	}

	public void asetaAika(int tunnit, int minuutit, int sekunnit) {
		this.tunnit.asetaArvo(tunnit);
		this.minuutit.asetaArvo(minuutit);
		this.sekunnit.asetaArvo(sekunnit);
	}

	public void etene() {
		sekunnit.etene();
		if (sekunnit.getArvo() == 0) {
			minuutit.etene();
			if (minuutit.getArvo() == 0) {
				tunnit.etene();
			}
		}
	}

	public void tulostaAika() {
		System.out.printf("%02d:%02d:%02d\n", tunnit.getArvo(), minuutit.getArvo(), sekunnit.getArvo());
	}

	@Override
	public Kello clone() throws CloneNotSupportedException {
		Kello kello = (Kello) super.clone();
		kello.tunnit = this.tunnit.clone();
		kello.minuutit = this.minuutit.clone();
		kello.sekunnit = this.sekunnit.clone();
		return kello;
	}
}