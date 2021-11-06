import java.util.*;

public class largestAndSmallestInArray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		
		int length = s.nextInt();

		int arr[] = new int[length];

		for (int i = 0; i < length; i++) {
			
			arr[i]= s.nextInt();	

		}
		int large,small,i;
	
		int n = arr.length;
		large=small=arr[0];
		for(i=1;i<n;++i)
		{
		if(arr[i]>large)
		large=arr[i];

		if(arr[i]<small)
		small=arr[i];
		}

		System.out.println(small);
		System.out.println(large);
	}
}
