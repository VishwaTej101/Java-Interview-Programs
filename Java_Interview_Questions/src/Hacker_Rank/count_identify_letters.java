package Hacker_Rank;

import java.util.*;

public class count_identify_letters {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String word = s.next();

		int len = word.length();

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len - 1; j++) {
				if (word.charAt(i) != word.charAt(j)) {

				}
			}
		}

	}

}
