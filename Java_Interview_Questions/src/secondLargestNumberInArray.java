import java.util.*;
public class secondLargestNumberInArray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		
		int length = s.nextInt();

		int arr[] = new int[length];

		for (int i = 0; i < length; i++) {
			
			arr[i]= s.nextInt();	

		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[length-2]);
		
	}

}
