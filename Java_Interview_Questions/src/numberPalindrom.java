import java.util.*;

public class numberPalindrom {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int sum = 0;
		int r = 0;
		int temp = n;

		while (n > 0) {

			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;

		}
		if(sum==temp) {
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
