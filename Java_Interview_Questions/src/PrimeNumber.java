import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int n=s.nextInt();
		int count=0;
		
		for(int i=2;i<=n-1;i++) {
			if(n%i==0) {
				count++;
			}
			
		}
		if(count>0) {
			System.out.println("not prime");
		}
		else {
			System.out.println("prime");
		}
		

	}

}
