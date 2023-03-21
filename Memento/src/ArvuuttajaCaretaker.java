public class ArvuuttajaCaretaker {

	private Object obj;
	private int numero;

	public void liityPeliin(ArvuuttajaOriginator arvuuttaja, String asiakas) {
		this.obj = arvuuttaja.liityPeliin(asiakas);
	}

	public void arvaus(ArvuuttajaOriginator arvuuttaja, int arvattuNumero) {
		this.numero = arvattuNumero;
		arvuuttaja.arvaus(obj, numero);
	}

}