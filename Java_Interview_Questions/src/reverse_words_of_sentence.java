import java.util.*;
public class reverse_words_of_sentence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String v = s.nextLine();
		v = v +" ";
		String word = "";
		
		String revsen="";
		
		for(int i =0; i<v.length();i++ ) {
			char ch = v.charAt(i);
			
			if(ch != ' ') {
				word = word +ch;
			}else {
				revsen = word +" " + revsen;
				word = "";
			}
		}
		System.out.println(revsen);
		
	}

}
