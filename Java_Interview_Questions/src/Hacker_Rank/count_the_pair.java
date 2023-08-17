package Hacker_Rank;

import java.util.*;

public class count_the_pair {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int v = s.nextInt();

		int arr[] = new int[v];
		
		int count=0;
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i] = s.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]+" "+ arr[j]);
					count++;
					continue;
				}
			
			}
		}
		
		if(count%2==0) {
			System.out.println(count/2);
		}else {
			System.out.println(count);
		}
		
	

	}

}
