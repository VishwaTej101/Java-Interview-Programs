import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n=s.nextInt();
		int temp=0;
		int sum=0;
		int damm=n;
		while(n>=1) {
			temp=n%10;
			
			sum += temp*temp*temp;
			
			n=n/10;
		}
		if(sum==damm) {
			System.out.println("armstrong number");
			
		}
		else {
			System.out.println("not armstrong");
		}
		
		

	}

}
