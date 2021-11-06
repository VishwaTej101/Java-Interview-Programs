import java.util.*;
public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
		
		int length=s.nextInt();
		int count=0;
		
		int arr[]=new int[length];
		
		for(int i=0;i<length;i++) {
			arr[i]= s.nextInt();
		}
		
		 Arrays.sort(arr);
		 
		 int arr1[]=new int[length];
		 int j=0;
		 for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr1[j]=arr[i];
				j++;
			 }
			arr1[j]=arr[arr.length-1];
			 
		 }
		 
		 for(int i=0;i<arr1.length;i++) {
			 System.out.print(arr1[i]+" ");
			 
		 }
		 
		 
		
		

		
		
	}

}
