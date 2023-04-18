public class Main {
	public static void main(String[] args) {
		// create a clock object
		Kello kello1 = new Kello();
		kello1.asetaAika(12, 30, 0);

		// deep copy
		Kello kello2 = null;
		try {
			kello2 = kello1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		kello1.asetaAika(13, 0, 0);

		System.out.print("Alkuperäinen: ");
		kello1.tulostaAika();
		System.out.print("Deep copy: ");
		kello2.tulostaAika();

		// shallow copy
		Kello kello3 = kello1;

		kello1.asetaAika(13, 30, 0);

		System.out.print("Alkuperäinen: ");
		kello1.tulostaAika();
		System.out.print("Shallow copied : ");
		kello3.tulostaAika();
	}
}