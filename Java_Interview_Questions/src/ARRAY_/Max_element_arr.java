package ARRAY_;
import java.util.*;
public class Max_element_arr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int [] arr = new int[n];
		
		int l= arr.length;
		
		
		for(int i=0;i<l-1;i++) {
			arr[i]= s.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println(arr[l-1]);
		
	}

}
