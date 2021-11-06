import java.util.*;
public class PrintOddEvenArray {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);

		int length = s.nextInt();
	

		int arr[] = new int[length];

		for (int i = 0; i < length; i++) {

			arr[i] = s.nextInt();

		}
		
		
		for(int i=0;i<length;i++) {
			if(arr[i]%2==0) {
				System.out.println("even"+"="+arr[i]);
			}
			else {
				System.out.println("odd"+"="+arr[i]);
			}
			
		}
		
		

	}

}
