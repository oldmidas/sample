public class Quiz3 {
	public static void main(String[] args) {
		String text = "a charSequence is a readable sequence of char values. This interface provides uniform, read-only access to many different kinds of char sequences. A char value represents a character in the Basic Multilingual Plane (BMP) or a surrogate. Refer to Unicode Character Representation for details. This interface does not refine the general contracts of the equals and hashCode methods. The result of comparing two objects that implement CharSequence is therefore, in general, undefined. Each object may be implemented by a different class, and there is no guarantee that each class will be capable of testing its instances for equality with those of the other. It is therefore inappropriate to use arbitrary CharSequence instances as elements in a set or as keys in a map.";
		text = text.toLowerCase();
		int[] arr = new int[26];

		for(int i = 0; i < text.length(); i++) {
			int value = text.charAt(i) - 97;
			if (value>=0) {
				arr[value]++;
			}
		}
		System.out.println(java.util.Arrays.toString(arr));

		for (int i=0; i<arr.length; i++) {
			System.out.println((char)(i+97) + " : " + arr[i]);
		}
	}
}