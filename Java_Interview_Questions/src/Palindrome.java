import java.util.*;

public class Palindrome{
	
	static boolean isPalindrome(String str) {
		
		int i=0,j=str.length()-1;
		
		while(i<j) {
			
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String args[]) {
	Scanner s= new Scanner(System.in);
	
	String S = s.next();
		
		if(isPalindrome(S))
			
			System.out.println("palindrome");
		
		else 
	 
			System.out.println("not palindrome");
		
		
}
}