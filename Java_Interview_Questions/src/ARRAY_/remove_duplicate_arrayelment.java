package ARRAY_;

import java.util.*;

public class remove_duplicate_arrayelment {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		int l = arr.length;
		for(int i=0;i<l-1;i++) {
			arr[i]= s.nextInt();
		}
		Arrays.sort(arr);
		
		int temp=0;
		int count=0;
		
		int newarr[] = new int[arr.length];
		
		
		for(int i =0;i<l-1;i++) {
			if(arr[i]!=arr[i+1]) {
				newarr[i]=arr[i];
				count++;
			}
			
		}
		if(count>0) {
			System.out.print("Dup ="+" "+ temp);
		}else {
			System.out.println("No duplicate");
		}

	}

}
