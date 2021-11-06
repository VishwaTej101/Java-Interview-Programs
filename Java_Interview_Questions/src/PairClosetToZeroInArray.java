import java.util.*;
public class PairClosetToZeroInArray {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int length = s.nextInt();

		int arr[] = new int[length];

		for (int i = 0; i < length; i++) {
			
			arr[i]= s.nextInt();	

		}
		
		int large = arr[0]+arr[1];
		
		for(int i = 0; i < length-1; i++) {
			for(int j = i+1; j < length; j++) {
				if(large>arr[i]+arr[j]) {
					large = arr[i]+arr[j];
				}
			}
		}
		System.out.println(large);

	}

}
