import java.util.*;
public class FactorialNumber {

	public static void main(String[] args) {
		
		// 2!=2, 3!= 1*2*3 =6
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact *=i;
			System.out.print(fact+" ");
		}
		System.out.println();
		System.out.println(fact);

	}

}
