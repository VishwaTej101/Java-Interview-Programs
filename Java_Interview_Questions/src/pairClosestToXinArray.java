import java.util.*;

public class pairClosestToXinArray {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int length = s.nextInt();
		int x = s.nextInt();

		int arr[] = new int[length];

		for (int i = 0; i < length; i++) {

			arr[i] = s.nextInt();

		}
		
		int pair1=0;
		int pair2=0;
		
		for(int i = 0; i < length-1; i++) {
			for(int j = i+1; j < length; j++) {
				if(arr[x]>=arr[i]+arr[j]) {
					
					pair1 = arr[i];
					pair2 = arr[j];
					System.out.println(arr[x]);
					System.out.println(pair1+" "+pair2);
				}
			}
		}
		

	}

}
