import java.util.*;

public class StringAnagram {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String val1 = s.nextLine();
		String val2 = s.nextLine();

		val1.replace(" ", "");
		val2.replace(" ", "");

		val1.toLowerCase();
		val2.toLowerCase();
		
		char a[] = val1.toCharArray();
		char b[] = val2.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		boolean result = Arrays.equals(a, b);

		if (result == true) {
			System.out.println("Anagram");
		} else {
			System.out.println("not Anagram");
		}
	}

}
