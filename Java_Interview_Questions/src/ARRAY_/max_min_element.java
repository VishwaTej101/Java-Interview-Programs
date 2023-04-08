package ARRAY_;

import java.util.*;

public class max_min_element {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
        int max=0 , min =0;
		int n = s.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {

			arr[i] = s.nextInt();
		}
		
		for(int j=1;j< n-1;j++) {
			if(arr[j]>arr[j+1]) {
				min= arr[j];
			}
			else {
				max = arr[j];
			}
		}
		System.out.println(max+" "+min);
		

	}

}
