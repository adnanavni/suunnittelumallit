
public class BootSimulator {
	private Computer computer;
	private Memory memory;
	private CPU cpu;

	public BootSimulator() {
		this.computer = new Computer();
		this.memory = new Memory();
		this.cpu = new CPU();
	}

	public void startComputer(byte[] bootSector) {
		long bootSectorPosition = 0L;

		memory.load(bootSectorPosition, bootSector);

		cpu.jump(bootSectorPosition);

		cpu.execute();

		byte[] partitionTable = memory.read(446L, 64);

		computer.processData();
	}
}