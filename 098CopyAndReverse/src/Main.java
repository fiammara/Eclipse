import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// write testcode here
		int[] original = { 18, 9, 3, 4 };
		int[] copied = copy(original);
		int[] reverse = reverseCopy(original);
		//copied[0] = 99;
		System.out.println("original: " + Arrays.toString(original));
		System.out.println("copied: " + Arrays.toString(copied));
		System.out.println("reversed: " + Arrays.toString(reverse));
	}

	public static int[] reverseCopy(int[] original) {
		int x;
		int[] reverse = new int[original.length];
		for (x = 0; x < original.length; x++) {
			reverse[x] = original[original.length-1-x];
		}
		return reverse;
	}

	public static int[] copy(int[] original) {

		int i;
		int[] copied = new int[original.length];

		for (i = 0; i < original.length; i++) {

			copied[i] = original[i];
			
		}
		return copied;
	}
}
