import java.util.Arrays;

public class Memory {
	private byte[] data = new byte[1024];

	public void load(long position, byte[] data) {
		System.arraycopy(data, 0, this.data, (int) position, data.length);
		System.out.println("Loaded data at position " + position + ": " + Arrays.toString(data));
	}

	public byte[] read(long position, int size) {
		byte[] result = Arrays.copyOfRange(data, (int) position, (int) position + size);
		System.out
				.println("Read data from position " + position + " with size " + size + ": " + Arrays.toString(result));
		return result;
	}
}