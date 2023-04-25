public class Main {
	public static void main(String[] args) {
		byte[] bootSector = new byte[] { /* boot sector data */ };
		BootSimulator bootSimulator = new BootSimulator();
		bootSimulator.startComputer(bootSector);
	}
}