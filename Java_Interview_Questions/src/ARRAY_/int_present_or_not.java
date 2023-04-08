package ARRAY_;

import java.util.*;

public class int_present_or_not {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int arr[] = new int[4];
		int count = 0;
		for(int j=0;j<4;j++) {
			arr[j] = s.nextInt();
		}
		for (int i = 0; i < 4; i++) {

			if (arr[i] == n) {
				count++;
				break;
			}

		}
		if (count > 0) {
			System.out.println("value present");
		} else {
			System.out.println("Value not present");
		}
	}

}
