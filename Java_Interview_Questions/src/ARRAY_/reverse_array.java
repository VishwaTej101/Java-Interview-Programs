package ARRAY_;

import java.util.*;

public class reverse_array {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		int temp[] = new int[n];
        
		for(int i=0;i<arr.length;i++) {
			
			arr[i] =s.nextInt();
			
		}
		int count=0;
		for(int j=arr.length-1;j>0;j--) {
			temp[count] = arr[j];
			count++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(temp[i]+" ");
		}
	}

}
