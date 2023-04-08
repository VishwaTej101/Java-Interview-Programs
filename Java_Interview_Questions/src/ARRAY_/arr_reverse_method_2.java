package ARRAY_;
import java.util.*;
public class arr_reverse_method_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		
		int[] arr = new int[n];
		
		int l = arr.length;
		
		for(int i=0;i<l;i++) {
			arr[i]= s.nextInt();
		}
		
		int temp =0;
		
		//arr[j-l-1] formula to reverse
		
		int value = Math.floorDiv(l, 2);
		
		for(int j=0;j<value;j++) {
			
			temp = arr[j];
			arr[j]= arr[l-j-1];
			arr[l-j-1] = temp;
			
			
		}
		
	  for(int element:arr) {
		  System.out.print(element+" ");
	  }

	}

}
