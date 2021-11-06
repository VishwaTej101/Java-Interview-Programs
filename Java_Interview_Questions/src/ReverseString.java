import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
	   String val=s.next();
	   
	   int length=val.length();
	   
	   String val2="";
	   
	   for(int i=length-1;i>=0;i--) {
		   
		   val2 += val.charAt(i);
	   }
	   
	   System.out.println(val2);

	}

}
